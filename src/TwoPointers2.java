import java.util.*;


/**
 *  1. a,b 배열 오름차순 정렬
 *  2. a[p1] == b[p2], answer에 값 삽입 +  p1++ + p2++
 *     a[p1]<b[p2], p1++
 *     a[p1] > b[p2], p2++;
 * 
 */ 

public class TwoPointers2 {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer= new ArrayList<>();
		int p1=0, p2=0;
		Arrays.sort(a);
		Arrays.sort(b);
		while(p1<n && p2<m) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}else if(a[p1]<b[p2])
				p1++;
			else
				p2++;
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		TwoPointers2 T = new TwoPointers2();
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
        for (int x : T.solution(n, m, a, b)) {	
        	 System.out.print(x+ " ");
        }
     }
}
