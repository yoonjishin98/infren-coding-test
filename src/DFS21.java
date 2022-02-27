import java.util.*;

public class DFS21 {
	static int n,answer=0;
	static int[][] board;
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	public static void DFS(int x, int y) {
		
		for(int i=0; i<8; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) {
				board[nx][ny]=0;
				DFS(nx,ny);
			}
		}
	}
	
	public static void solution() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					board[i][j]=0;
					answer++;
					DFS(i,j);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		n = scan.nextInt();
		board = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j] = scan.nextInt();
			}
		}
		solution();
		System.out.println(answer);
	}

}
