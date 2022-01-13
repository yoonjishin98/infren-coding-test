import java.util.*;

/**
 * 
 * 1. 문자열 7개씩 나누고, 암호 이진수로 바꾸기
 * 2. 이진수 십진수로 바꾸기
 * 3. 십진수 문자로 바꿔서 출력
 * 
 */ 
 
public class String12 {
	public String solution(int n, String str){
		String answer = "";
		
		for(int i=0; i<n; i++) {
			String tmp = str.substring(0,7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp,2);	//이진수 -> 십진수
			answer += (char)num;	//십진수 -> 문자(알파벳)
			str = str.substring(7);
		}
		
		return answer;
    }

    public static void main(String[] args){
    	String12 T = new String12();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        
        System.out.println(T.solution(n, str));
    }
}
