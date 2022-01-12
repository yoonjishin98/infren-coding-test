import java.util.Scanner;

/**
 * [1]
 * 1. 문자열 대문자 혹은 소문자로 통일하기
 * 2. lt의 문자와 rt의 문자가 같은지 비교하기
 * 3. 같다면 yes, 아니면 for문 빠져나와서 no 출력하기
 *
 * [2]
 * 1. 문자열 stringbuilder로 뒤집기
 * 2. 문자열과 뒤집은 문자열 비교: equalsIgnoreCase() 사용
 * 
 */

public class String7 {
	public String solution(String str){
		
		// [1]
//		String answer = "YES";
//		int len = str.length();
//		str = str.toUpperCase();
//		
//		for (int i=0; i<len/2; i++) {
//			if(str.charAt(i) != str.charAt(len-1-i)) {
//				return "NO";
//			}
//		}
		
		// [2]
		String answer = "NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp))
			answer = "YES";
		
        return answer;
    }

    public static void main(String[] args){
    	String7 T = new String7();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.println(T.solution(str));
    }
}
