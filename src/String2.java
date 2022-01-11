import java.util.Scanner;


/**
 * @author YJ
 *
 * 1. 입력받은 문자열 배열로 바꾸기
 * 2. 소문자이면 대문자로, 대문자이면 소문자로 변환
 * 		(1) Character.toUpperCase(), Character.toLowerCase()
 * 		(2) 아스키 코드
 *
 */

class String2{
    public String solution (String str){
        String answer="";
        
        // 1.
        for (char x : str.toCharArray()) {
        	
        	// 2.
        	if(Character.isLowerCase(x)) 	answer += Character.toUpperCase(x);
        	else  	answer += Character.toLowerCase(x);
        }

		return answer;
    }

    public static void main(String[] args){
    	String2 T = new String2();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.print(T.solution(str));
    }
}