import java.util.Scanner;

public class DFS13 {
	static int n,m,sum,time,answer = 0;
	
	public void DFS(int L, int sum, int time, int[] arr1, int[] arr2) {
		if(time > m)	return;
		if(L==n) {
			answer = Math.max(answer, sum);
		}else {
			DFS(L+1, sum+arr1[L], time+arr2[L], arr1, arr2);
			DFS(L+1, sum, time, arr1, arr2);
		}
	}
	
	public static void main(String args[]) {
		DFS13 T = new DFS13();
		Scanner scan = new Scanner (System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
		}
		T.DFS(0, 0, 0, arr1, arr2);
		System.out.println(answer);
	}
}
