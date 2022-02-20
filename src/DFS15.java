import java.util.*;

// BFS, 다이나믹 프로그래밍을로도 해결 가능
public class DFS15 {
	static int n,m,sum;
	static int answer = Integer.MAX_VALUE;
	
	public void DFS(int L, int sum, Integer[] arr) {
		if(sum>m) 	return;
		if(L>=answer)	return;	//시간복잡도를 위해
		if(sum==m) {
			answer = Math.min(answer, L);
		}else {
			for(int i=0; i<n; i++) {
				DFS(L+1, sum+arr[i], arr);
			}
		}
	}

	public static void main(String[] args) {
		DFS15 T = new DFS15();
		Scanner scan = new Scanner (System.in);
		n = scan.nextInt();
		Integer[] arr = new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());	//시간복잡도를 위한 내림차순 정렬
		m = scan.nextInt();
		T.DFS(0,0, arr);
		System.out.println(answer);

	}

}
