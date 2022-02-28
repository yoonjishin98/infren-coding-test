import java.util.*;

class Point4 {
	int x,y;
	
	Point4(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class DFS22 {
	static int n,m,answer=Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point4> house,pizza;
	
	public static void DFS(int L, int s) {
		if(L==m) {
			int sum = 0;
			for(Point4 hs:house) {
				int dis = Integer.MAX_VALUE;
				for(int i:combi) {	// 하나의 집에서 피자집(4개)으로 가는 거리 중 최소 거리 찾기
					dis = Math.min(dis, Math.abs(hs.x-pizza.get(i).x) +Math.abs( hs.y-pizza.get(i).y) );
				}
				sum+=dis;	// 조합 케이스 1개의 최소배달거리
			}
			answer = Math.min(answer, sum);	// 여러 조합 케이스 중 최소배달거리
		}else {
			for(int i=s; i<pizza.size(); i++) {
				combi[L]=i;
				DFS(L+1, i+1);
			}
		}
	}

	public static void main(String[] args) {
		DFS22 T = new DFS22();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		house = new ArrayList<>();
		pizza = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int tmp = scan.nextInt();
				if(tmp==1)
					house.add(new Point4(i,j));
				else if(tmp==2)
					pizza.add(new Point4(i,j));
			}
		}
		combi = new int[m];
		DFS(0,0);
		System.out.println(answer);
	}
}
