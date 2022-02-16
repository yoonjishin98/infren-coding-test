import java.util.*;

//입력값
//5 9
//1 2
//1 3
//1 4
//2 1
//2 3
//2 5
//3 4
//4 2
//4 5

public class DFS9 {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v==n)	answer++;
		else {
			for(int nextv : graph.get(v)) {
				if(ch[nextv] == 0) {
					ch[nextv] = 1;
					DFS(nextv);
					ch[nextv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		DFS9 T = new DFS9();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
	}
}
