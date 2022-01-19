// 피보나치 수열 재귀로 풀기

public class DFS4 {
	static int[] fibo;
	public int DFS(int n) {
		if(fibo[n]>0)	return fibo[n];		// 메모이제이션: 가장 효율적
		if(n==1)	return fibo[n]=1;
		else if(n==2)	return fibo[n]=1;
		else return fibo[n]=DFS(n-2)+DFS(n-1);
	}
	
	public static void main(String[] args) {
		DFS4 T = new DFS4();
		int n=45;
		fibo = new int [n+1];
		T.DFS(n);
		for(int i=1; i<=n; i++) {
			System.out.print(fibo[i] + " ");
		}
		
		// 이렇게 구하면 시간이 너무 오래 걸려서 비효율적
//		for(int i=1; i<=n; i++) {
//			System.out.print(T.DFS(i) + " ");
//		}
	}
}
