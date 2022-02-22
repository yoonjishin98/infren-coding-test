import java.util.Scanner;

public class DFS17 {
	int[][] dy = new int[35][35];	//메모이제이션
	
	public int DFS(int n, int r) {
		if(dy[n][r] > 0)	return dy[n][r];
		if(n==r || r==0) 	return 1;
		else 	return dy[n][r] = DFS(n-1,r-1) + DFS(n-1, r);
	}

	public static void main(String[] args) {
		DFS17 T = new DFS17();
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		System.out.println(T.DFS(n,r));
	}
}
