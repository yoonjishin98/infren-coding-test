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
        	
        	// 2-(1)
        	if(Character.isLowerCase(x)) 	answer += Character.toUpperCase(x);
        	else  	answer += Character.toLowerCase(x);
        	
        	//2-(2) 아스키 코드 65~90: 대문자, 97~122: 소문자
        	if(x>=97 && x<=122) 	answer += (char)(x-32);
        	else  	answer += (char)(x+32);
//        	if(Character.isLowerCase(x)) 	answer += Character.toUpperCase(x);
//        	else  	answer += Character.toLowerCase(x);
        	
        	//2-(2) 아스키 코드 65~90: 대문자, 97~122: 소문자
        	if(x>=97 && x<=122) 	answer += (char)(x-32);
        	else  	answer += (char)(x+32);
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