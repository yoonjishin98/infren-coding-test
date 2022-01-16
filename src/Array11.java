import java.util.ArrayList;
import java.util.Scanner;

/**
 *  1.
 *  2. 
 *  3. 
 * 
 */ 

public class Array11 {
	public int solution(int n, int[][] arr){
		int answer= 0, max = Integer.MIN_VALUE;
		
		for(int i=1; i<=n; i++) {
			int cnt=0;
			
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;	// 두 번 이상 같은 반이 되어도 cnt는 한 번만 올라가야 하니까
					}
				}
			}
			if(cnt>max) {
				max = cnt;
				answer = i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Array11 T = new Array11();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n+1][6];
        for (int i=1; i<=n; i++) {	//학생번호
        	for (int j=1; j<=5; j++) {		//학년
        		arr[i][j] = scan.nextInt();
        	}
        }
        System.out.print(T.solution(n, arr));
        
     }
}
