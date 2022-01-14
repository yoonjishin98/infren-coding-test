import java.util.*;

/**
 * 1. answer에 입력받은 배열의 첫 정수 삽입
 * 2. 앞 수와 비교해서 크면 answer에 추가 
 * 
 */ 
 
public class Array1 {
	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		
		answer.add(arr[0]);
		for(int i=1; i<n; i++) {
			if(arr[i] > arr[i-1])	answer.add(arr[i]);
		}
		
		return answer;
    }

    public static void main(String[] args){
    	Array1 T = new Array1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n;i++) {
        	arr[i] = scan.nextInt();
        }
        for(int x:T.solution(n, arr)) {
        	System.out.print(x+" ");
        }
        
    }
}
