import java.util.Scanner;

public class DFS12 {
	static int c,n,sum,answer = 0;
	
	public void DFS(int L, int sum, int[] arr) {
		if(sum > c)	return;
		if(L==n) {
			answer = Math.max(answer, sum);
		}else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
	}
	
	public static void main(String args[]) {
		DFS12 T = new DFS12();
		Scanner scan = new Scanner (System.in);
		c = scan.nextInt();
		n = scan.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}
}
