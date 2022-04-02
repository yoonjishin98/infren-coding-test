import java.util.Scanner;

public class Sorting2 {
	public int[] solution(int n, int[] arr) {
		int tmp = -1;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Sorting2 T = new Sorting2();
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
