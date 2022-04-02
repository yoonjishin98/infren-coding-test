import java.util.*;

// 깊은 복사: 새로운 메모리 공간에 복사
// 얕은 복사: 주소값을 복사함으로써 원본값이 변화하면 복사된 값도 함께 변화됨


public class Sorting6 {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] tmp = arr.clone();		//깊은 복사해야함. 
		Arrays.sort(tmp);
		
		for(int i=0; i<n; i++) {
			if(arr[i] != tmp[i]) 
				answer.add(i+1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Sorting6 T = new Sorting6();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}

}
