import java.util.Arrays;
import java.util.Scanner;

public class Sorting10 {
	public int count(int[] arr, int distance) {
		int cnt = 1, ep=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-ep >= distance) {
				cnt++;
				ep=arr[i];
			}
		}
		
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt=1;
		int rt=arr[n-1];
		
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			
			if(count(arr, mid) >= m) {
				lt = mid+1;
				answer=mid;
			}
			else
				rt = mid-1;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sorting10 T = new Sorting10();
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = scan.nextInt();

		System.out.println(T.solution(n,m,arr));


	}

}
