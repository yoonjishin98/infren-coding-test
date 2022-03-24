import java.util.*;

public class HashMap3 {
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int lt=0;
		
		for(int i=0; i<k-1; i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		
		for(int rt=k-1; rt<n; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt]) == 0)
				map.remove(arr[lt]);
			lt++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		HashMap3 T = new HashMap3();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<k; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int x:T.solution(n, k, arr)) {
			System.out.print(x + " ");
		}
		
	}

}
