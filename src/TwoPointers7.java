import java.util.Scanner;

public class TwoPointers7 {
	public int solution(int[] arr, int n, int k) {
		int answer=0, cnt=0, lt=0;
		
		for(int rt=0; rt<n; rt++) {
			if(arr[rt]==0) 
				cnt++;	// 0->1로 바꾼 횟수
			while(cnt>k) {
				if(arr[lt]==0)
					cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		return answer;
	}

	public static void main(String[] args) {
		TwoPointers7 T = new TwoPointers7();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print(T.solution(arr, n, k));

	}

}
