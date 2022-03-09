import java.util.*;

class Edge2 implements Comparable<Edge2>{
	public int v1;
	public int v2;
	public int cost;
	
	Edge2(int v1,int v2, int cost){
		this.v1 = v1;
		this.v2 = v2;
		this.cost =cost;
	}
	
	@Override
	public int compareTo(Edge2 ob) {
		return this.cost-ob.cost;
	}
}

public class Greedy7 {
	static int[] unf;
	
	public static int Find(int v) {
		if(v==unf[v])
			return v;
		else
			return unf[v]=Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb)
			unf[fa]=fb;
	}

	public static void main(String[] args) {
		Greedy7 T = new Greedy7();
		Scanner scan = new Scanner(System.in);
		int v = scan.nextInt();
		int e = scan.nextInt();
		unf = new int[v+1];
		ArrayList<Edge2> arr = new ArrayList<>();
		
		for(int i=1; i<=v; i++)
			unf[i]=i;
		for(int i=0; i<e; i++) {
			int a= scan.nextInt();
			int b= scan.nextInt();
			int c= scan.nextInt();
			arr.add(new Edge2(a,b,c));
		}
		int answer = 0;
		Collections.sort(arr);	// cost 기준 오름차순 정렬
		for(Edge2 ob:arr) {
			int fv1=Find(ob.v1);
			int fv2=Find(ob.v2);
			if(fv1 != fv2) {	// 다른 집합에 있으면
				answer += ob.cost;
				Union(ob.v1, ob.v2);	// 같은 집합으로 만듦
			}
		}
		
		System.out.println(answer);
	}

}
