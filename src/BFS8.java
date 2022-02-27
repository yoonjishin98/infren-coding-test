import java.util.*;

class Point3{
	public int x,y;
	
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class BFS8 {
	static int n, answer;
	static int[][] board;
	static Queue<Point3> q = new LinkedList<>();
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	public void BFS(int x, int y) {
		q.add(new Point3(x,y));

		while(!q.isEmpty()) {
			Point3 tmp = q.poll();
			
			for(int i=0;i<8;i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) {
					board[nx][ny]=0;
					q.offer(new Point3(nx,ny));
				}
			}
		}
	}
	
	public void solution() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==1) {
					answer++;
					board[i][j] = 0 ;
					BFS(i,j);
				}
			}
		}
	}

	public static void main(String[] args) {
		BFS8 T = new BFS8();
		Scanner scan = new Scanner (System.in);
		n = scan.nextInt();
		board = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j] = scan.nextInt();
			}
		}
		T.solution();
		System.out.println(answer);
	}

}
