import java.util.Scanner;

public class DFS14 {
	static int[] pm;
	static int n,m;
	
	public void DFS(int L) {
		if(L==m) {
			for(int x:pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		}else {
			for(int i=1; i<=n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}

	public static void main(String[] args) {
		DFS14 T = new DFS14();
		Scanner scan = new Scanner (System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		pm = new int[m];
		T.DFS(0);
	}

}
