import java.util.ArrayList;
import java.util.Scanner;

/**
 *  1. 행의 합, 열의 합: 이중 for문
 *  2. 대각선의 합: for문 (대각선: [0][0], [1][1] ...)
 * 
 */ 

public class Array9 {
	public int solution(int n, int[][] arr){
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		
		// 1. 행의 합, 열의 합
		for(int i=0; i<n; i++) {
			sum1=sum2=0;
			for(int j=0; j<n; j++) {
				sum1 += arr[i][j];  	//행의 합
				sum2 += arr[j][i];		//열의 합
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer,sum2);
		}

		// 2. 대각선의 합
		sum1 = sum2 = 0;
		for (int i=0; i<n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-1-i];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer,sum2);
		
		return answer;
	}
	
	public static void main(String[] args){
		Array9 T = new Array9();
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
