import java.util.*;

public class Stack3 {
	public int solution(int n, int[][] board, int[] moves) {
		int answer = 0;
		int prev = -1;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<moves.length; i++) {
			for(int j=0;j<n; j++) {
				if(board[j][moves[i]-1] != 0) {
					stack.push(board[j][moves[i]-1]);
					board[j][moves[i]-1]=0;
					
					if(prev==stack.peek()) {
						stack.pop();
						stack.pop();
						answer+=2;
					}
					prev = stack.peek();
					break;
				}
			}
		}
		
//		// 선생님 코드
//		for(int pos : moves){
//			for(int i=0; i<board.length; i++){
//				if(board[i][pos-1]!=0){
//					int tmp=board[i][pos-1];
//					board[i][pos-1]=0;
//					if(!stack.isEmpty() && tmp==stack.peek()){
//						answer+=2;
//						stack.pop();
//					}
//					else stack.push(tmp);
//					break;
//				}
//			}
//		}
		
		return answer;
	}

	public static void main(String[] args) {
		Stack3 T = new Stack3();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] board = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		int m = scan.nextInt();
		int[] moves = new int[m];
		for(int i=0; i<m; i++)
			moves[i] = scan.nextInt();
		
		System.out.println(T.solution(n,board,moves));

	}

}
