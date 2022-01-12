import java.util.Scanner;

/**
 * 
 * 1. 알파벳 대문자 혹은 소문자로 통일 + 알파벳 이외의 특수문자는 제거
 * 2. 알파벳 뒤집기
 * 
 */ 
 
public class String8 {
	public String solution(String str){
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]", "");	//정규식
		String tmp = new StringBuilder(str).reverse().toString();
		if (str.equals(tmp))
			answer = "YES";
		
        return answer;
    }

    public static void main(String[] args){
    	String8 T = new String8();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        System.out.println(T.solution(str));
    }
}
