import java.util.*;

public class DFS1 {
	public void DFS(int n) {
		if(n==0)	return;
		else {
			System.out.println(n+" ");	// 결과: 3 2 1
			DFS(n-1);
			System.out.print(n+" ");	// 결과: 1 2 3. DFS는 스택 프레임을 사용하기 때문.
		}
	}
	
	public static void main(String[] args) {
		DFS1 T = new DFS1();
		T.DFS(3);
	}
}
