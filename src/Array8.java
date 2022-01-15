import java.util.ArrayList;
import java.util.Scanner;

/**
 *  1. 이중 for문을 이용해 다른 숫자와 비교해 i의 등수를 구함
 * 
 */ 

public class Array8 {
	public int[] solution(int n, int[] arr){
		int[] answer= new int[n];
		
		for(int i=0; i<n; i++) {
			int cnt=1;
			for(int j=0; j<n; j++) {
				if(arr[j] > arr[i])	cnt++;
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Array8 T = new Array8();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
        	arr[i] = scan.nextInt();
        }
        for( int x: T.solution(n, arr)) {
            System.out.print(x +" ");
        }
     }
}
