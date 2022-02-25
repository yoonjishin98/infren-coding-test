import java.util.*;

class Point2{
	public int x,y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class BFS7 {
	static int m,n;
	static int[][] board, date;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,-1,0,1};
	static Queue<Point2> q = new LinkedList<>();
	
	static void BFS() {
		while(!q.isEmpty()) {
			Point2 tmp = q.poll();
			
			for(int i=0;i<4;i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0) {	//이해안감
					board[nx][ny] = 1;
					q.offer(new Point2(nx,ny));
					date[nx][ny] = date[tmp.x][tmp.y]+1;
				}
			}
		}
	}

	public static void main(String[] args) {
		BFS7 T = new BFS7();
		Scanner scan = new Scanner (System.in);
		m = scan.nextInt();
		n = scan.nextInt();
		board = new int[n][m];
		date = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				board[i][j] = scan.nextInt(); 
				if(board[i][j]==1)
					q.offer(new Point2(i,j));	
			}
		}
		T.BFS();
		
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {	
				if(board[i][j]==0)	// 익지 않은 토마토 있음
					flag = false;	
			}
		}
		
		if(flag) {	// 토마토가 다 익은 경우
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {	
					answer = Math.max(answer, date[i][j]);
				}
			}
			System.out.println(answer);
		}else 
			System.out.println(-1);
	}

}
