import java.util.ArrayList;
import java.util.Scanner;

/**
 *  1. p1<n && p2<m, answer에 작은 값 answer에 삽입
 *  2. p1 또는 p2가 남았을 경우, 경우 나눠서 남은 값 answer에 삽입
 * 
 */ 

public class TwoPointers1 {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer= new ArrayList<>();
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(a[p1]<b[p2])		answer.add(a[p1++]);
			else	answer.add(b[p2++]); 
		}
		while(p1<n) {
			answer.add(a[p1++]);
		}
		while(p2<m) {
			answer.add(b[p2++]);
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		TwoPointers1 T = new TwoPointers1();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
        	a[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++) {
        	b[i] = scan.nextInt();
        }
        for (int x : T.solution(n, m, a,b)) {	
        	 System.out.print(x+ " ");
        }
     }
}
