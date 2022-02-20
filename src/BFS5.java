import java.util.*;

public class BFS5 {
	static int n,m,sum;
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int coinType, int[] arr){
		int[] resultCase = new int[501];
		int L = 0;
		resultCase[coinType] = 1;
		Q.offer(coinType);
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i=0; i<len; i++) {
				int p = Q.poll();
				
				for(int j=0; j<n; j++) {
					int nv = p+arr[j];
					if(nv==m)	return L+1;
					if(resultCase[nv]==0 && nv>=1 && nv<=500) {
						resultCase[nv]=1;
						Q.offer(nv);
					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		BFS5 T = new BFS5();
		Scanner scan = new Scanner (System.in);
		n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		m = scan.nextInt();
		System.out.println(T.BFS(0, arr));

	}

}
