import java.util.*;

public class Sorting1 {
	public int[] solution(int n, int[] arr) {
		int tmp = -1;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		Sorting1 T = new Sorting1();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int x : T.solution(n, arr))
			System.out.print(x+" ");
	}
}
