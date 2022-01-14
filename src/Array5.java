import java.util.*;

/**
 *  에라토스테네스의 체가 소수 문제를 푸는 방법론 중에서는 가장 빠름
 *  에라토스테네스의 체: 구해야 하는 범위 내에서 배수인 숫자를 지워가는 방법
 * 
 */ 

public class Array5 {
	public int solution(int n){
		int answer = 0;
		int[] ch = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			if(ch[i] == 0) {
				answer++;
				
				for(int j=i; j<=n; j=j+i) {
					ch[j] = 1;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		Array5 T = new Array5();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        System.out.println(T.solution(n));
    }
}
