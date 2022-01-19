public class DFS2 {
	public void DFS(int n) {
		if(n==0)	return;
		else {
			DFS(n/2);
			System.out.print(n%2+" ");
		}
	}
	
	public static void main(String[] args) {
		DFS2 T = new DFS2();
		T.DFS(11);
	}
}
