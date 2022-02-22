import java.util.Scanner;

// 스택 및 트리 로직 흐름 설명 잘 되어있는 챕터. 나중에 기억안나면 참고 ㄱㄱ.
public class DFS16 {
	static int n,m;
	static int[] pm, ch, arr;
	
	public static void DFS(int L) {
		
		if(L==m) {
			for(int x : pm) {
				System.out.print(x + " ");
			}
			System.out.println();
		}else {
			for(int i=0; i<n; i++) {
				if(ch[i]==0) {
					ch[i]=1;
					pm[L]=arr[i];
					DFS(L+1);
					ch[i]=0;
				}
			}
		}
	}

	public static void main(String[] args) {
		DFS16 T = new DFS16();
		Scanner scan = new Scanner (System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}		
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
	}

}
