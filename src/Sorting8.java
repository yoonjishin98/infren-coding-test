import java.util.*;

public class Sorting8 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		int low=0, high =n-1;
		Arrays.sort(arr);
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(m < arr[mid])
				high = mid-1;
			else if(m > arr[mid])
				low=mid+1;
			else {
				answer = mid+1;
				break;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sorting8 T = new Sorting8();
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();

		System.out.println(T.solution(n,m,arr));
	}

}
