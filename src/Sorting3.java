import java.util.Scanner;

public class Sorting3 {
	public int[] solution(int n, int[] arr) {
		
		for(int i=1; i<n; i++) {
			int tmp = arr[i],j;
			
			for(j=i-1; j>=0; j--) {
				if(tmp < arr[j]) 
					arr[j+1] = arr[j];
				else
					break;
			}
			arr[j+1] = tmp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		Sorting3 T = new Sorting3();
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
