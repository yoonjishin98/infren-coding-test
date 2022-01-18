import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 *  1. answer을 가장 앞의 세 값(윈도우)을 더한 것으로 초기화
 *  2. 그 다음부터는 윈도우 다음 값을 더하고, 기존 윈도우의 첫번째 값은 빼는 것을 반복
 *  3. answer은 기존 answer과 새 윈도우의 sum 중에 큰 값
 * 
 */ 

public class SlidingWindow1 {
	public int solution(int n, int k, int[] arr){
		int answer=0, sum=0;
		
		for(int i=0; i<k; i++)
			sum+=arr[i];
		answer = sum;
		
		for(int i=k;i<n;i++) {
			sum +=(arr[i]-arr[i-k]);
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		SlidingWindow1 T = new SlidingWindow1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
        	arr[i] = scan.nextInt();
        }
       System.out.print(T.solution(n, k, arr));
     }
}
