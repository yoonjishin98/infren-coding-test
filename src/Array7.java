import java.util.ArrayList;
import java.util.Scanner;

/**
 *  1. 맞은 문제: cnt++, answer += cnt
 *  2. 틀린 문제: cnt=0
 * 
 */ 

public class Array7 {
	public int solution(int n, int[] arr){
		int answer= 0, cnt=0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
			}else
				cnt=0;
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Array7 T = new Array7();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
        	arr[i] = scan.nextInt();
        }
        System.out.print(T.solution(n, arr));
     }
}
