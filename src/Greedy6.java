import java.util.Scanner;

public class Greedy6 {
	static int[] unf;
	
	public static int Find(int v) {
		if(v==unf[v])
			return v;
		else
			return unf[v]=Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb)
			unf[fa] = fb;
	}

	public static void main(String[] args) {
		Greedy6 T = new Greedy6();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		unf = new int[n+1];
		
		for(int i=1; i<=n; i++)
			unf[i]=i;
		for(int i=1; i<=m; i++) {
			int a= scan.nextInt();
			int b= scan.nextInt();
			Union(a,b);
		}
		int a= scan.nextInt();
		int b= scan.nextInt();
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb)
			System.out.print("NO");
		else
			System.out.print("YES");
	}
}
