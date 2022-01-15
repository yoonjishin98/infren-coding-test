import java.util.ArrayList;
import java.util.Scanner;

/**
 *  1.삼중 for문으로 상하좌우 좌표의 위치 구해서 비교하기
 *  2. 상하좌우의 값보다 중앙의 값이 크면 answer++
 *  3. 가장자리 처리하기
 * 
 */ 

public class Array10 {
	int[] dx = {-1,0,1,0};
	int[] dy = {0,1,0,-1};
	
	public int solution(int n, int[][] arr){
		int answer= 0;
		for( int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				
				for(int k=0; k<4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					//가장자리 처리 -> 조건문
					if( nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j] ) {
						flag = false;
						break;
					}
				}
				if(flag) 	answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Array10 T = new Array10();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
        	for (int j=0; j<n; j++) {
        		arr[i][j] = scan.nextInt();
        	}
        }
        System.out.print(T.solution(n, arr));
        
     }
}
