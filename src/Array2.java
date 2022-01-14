import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. max와 answer 초기화
 * 2. max < 배열 값이면, max 교체. answer++.
 * 
 */ 
 
public class Array2 {
	public int solution(int n, int[] arr){
		int answer = 1, max = arr[0];
		
		for(int i=1; i<n; i++) {
			if(max < arr[i]) {
				max = arr[i];
				answer++;
			}
		}
		
		return answer;
    }

    public static void main(String[] args){
    	Array2 T = new Array2();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++) {
        	arr[i] = scan.nextInt();
        }
        System.out.print(T.solution(n, arr));
        
    }
}
