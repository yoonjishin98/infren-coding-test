import java.util.*;

class Edge implements Comparable<Edge>{
	public int vex;
	public int cost;
	
	Edge(int vex, int cost){
		this.vex = vex;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Edge ob) {
		return this.cost-ob.cost;
	}
}

public class Greedy5 {
	static int n,m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;
	
	public void solution(int v) {
		PriorityQueue<Edge> pQ = new PriorityQueue<>();
		pQ.offer(new Edge(v,0));
		dis[v]=0;
		
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			
			int now =tmp.vex;
			int nowCost = tmp.cost;
			
			if(nowCost>dis[now])	// dis[now]의 최소값을 구하는 중인 거니까
				continue;
			for(Edge ob:graph.get(now)) {
				if(dis[ob.vex] > nowCost+ob.cost) {
					dis[ob.vex]=nowCost+ob.cost;
					pQ.offer(new Edge(ob.vex, nowCost+ob.cost));
				}
			}
		}
	}

	public static void main(String[] args) {
		Greedy5 T = new Greedy5();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge>());
		}
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			graph.get(a).add(new Edge(b,c));
		}
		T.solution(1);
		
		for(int i=2; i<=n; i++) {
			if(dis[i] != Integer.MAX_VALUE)
				System.out.println(i+" : "+dis[i]);
			else
				System.out.println(i+" : impossible");
		}
	}

}
