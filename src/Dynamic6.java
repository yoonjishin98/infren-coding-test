import java.util.Scanner;

public class Dynamic6 {
	static int[] dy;

	public static void main(String[] args) {
		Dynamic6 T = new Dynamic6();
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		dy = new int[m+1];
		
		for(int i=0; i<n; i++) {
			int ps = scan.nextInt();
			int pt = scan.nextInt();
			
			for(int j=m; j>=pt; j--) {
				dy[j] = Math.max(dy[j], dy[j-pt]+ps);
			}
		}
		System.out.println(dy[m]);
	}

}
