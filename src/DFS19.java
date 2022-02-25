import java.util.Scanner;

public class DFS19 {
	static int n,m;
	static int[] arr;
	
	public static void DFS(int L, int s) {	// s는 start번호. 즉, start부터 시작.
		if(L==m) {
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}else {
			for(int i=s; i<=n; i++) {
				arr[L]=i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		DFS19 T = new DFS19();
		Scanner scan = new Scanner (System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		arr = new int[m];
		DFS(0,1);
	}
}
