import java.util.*;

public class DFS3 {
	public int DFS(int n) {
		if(n==1)	return 1;
		else	return n*DFS(n-1);
		
	}
	
	public static void main(String[] args) {
		DFS3 T = new DFS3();
		System.out.println(T.DFS(5));
	}
}
