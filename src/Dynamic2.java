import java.util.Scanner;

public class Dynamic2 {
	static int[] dy;
	
	public static int solution(int n) {
		dy[1]=1; 
		dy[2]=2;
		
		for(int i=3; i<=n+1; i++) {
			dy[i]=dy[i-1]+dy[i-2];
		}
		
		return dy[n+1];
	}

	public static void main(String[] args) {
		Dynamic2 T = new Dynamic2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		dy = new int[n+2];
		System.out.println(T.solution(n));
	}

}
