import java.util.Scanner;

public class TwoPointers6 {
	public int solution(int n) {
		int answer=0, cnt=1;
		n--;
		while(n>0) {
			cnt++;
			n=n-cnt;
			if(n%cnt==0) 
				answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		TwoPointers6 T = new TwoPointers6();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.print(T.solution(n));
	}
}
