import java.util.*;

public class HashMap5 {
	public int solution(int n, int k, int[] arr) {
		int answer=-1;
		int lt=0;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());	// 내림차순 정렬
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int z=j+1; z<n; z++) {
					Tset.add(arr[i]+arr[j]+arr[z]);
				}
			}
		}
		int cnt=0;
		for(int x:Tset) {
			cnt++;
			if(cnt==k) {
				return x;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		HashMap5 T = new HashMap5();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(T.solution(n,k,arr));
	}

}
