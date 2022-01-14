import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. a와 b가 같으면 D
 * 2. a가 이기는 경우, A
 * 	- a=1, b=3 / a=2, b=1 / a=3, b=2
 * 3. 나머지의 경우: B
 * 
 * a-b해서 하는 방법도 있을 듯?
 */ 
 
public class Array3 {
	public String solution(int n, int[] a, int[] b){
		String answer = "";
		
		for(int i=0; i<n; i++) {
			if(a[i] == b[i])	answer += "D";
			else if(a[i]==1 && b[i]==3)	answer += "A";
			else if(a[i]==2 && b[i]==1)	answer += "A";
			else if(a[i]==3 && b[i]==2)	answer += "A";
			else	answer += "B";
		}
		
		return answer;
    }

    public static void main(String[] args){
    	Array3 T = new Array3();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n;i++) {
        	a[i] = scan.nextInt();
        }
        for(int i=0; i<n;i++) {
        	b[i] = scan.nextInt();
        }
        
        for(char x : T.solution(n, a, b).toCharArray()) {
        	System.out.println(x);
        }
    }
}
