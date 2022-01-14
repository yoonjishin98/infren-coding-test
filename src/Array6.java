import java.util.*;

/**
 *  1. 10으로 나눈 몫과 나머지를 사용해서 배열의 숫자 뒤집기
 *  2. 뒤집어진 숫자를 전까지의 숫자들로 나눠서 소수인지 판별하기
 * 
 */ 

public class Array6 {
	
	public boolean isPrime(int num) {
		if(num == 1)	
			return false;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) 
				return false;
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer= new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;
			
			while(tmp>0) {
				int t = tmp%10;
				res = res*10+t;
				tmp=tmp/10;
			}
			if(isPrime(res)) 
				answer.add(res);
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Array6 T = new Array6();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
        	arr[i] = scan.nextInt();
        }
        for(int x: T.solution(n,arr)) {
            System.out.print(x + " ");
        }
     }
}
