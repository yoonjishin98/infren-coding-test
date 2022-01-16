import java.util.ArrayList;
import java.util.Scanner;

/**
 *  1.
 *  2. 
 *  3. 
 * 
 */ 

public class Array12 {
	public int solution(int n, int m, int[][] arr){
		int answer= 0;
		
		for(int i=1; i<=n; i++) {	// 멘토
			for(int j=1; j<=n; j++) {	//멘티
				int cnt=0;
				for(int k=0; k<m; k++) {	// 테스트
					int pi=0, pj=0;
					for(int s=0; s<n; s++) {	// 등수
						if(arr[k][s] == i) 	pi=s;
						if(arr[k][s] == j) 	pj=s;
					}
					if(pi<pj)	cnt++;
				}
				if(cnt==m) {
					answer++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args){
		Array12 T = new Array12();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[m][n];
        for (int i=0; i<m; i++) {	
        	for (int j=0; j<n; j++) {	
        		arr[i][j] = scan.nextInt();
        	}
        }
        System.out.print(T.solution(n,m,arr));
        
     }
}
