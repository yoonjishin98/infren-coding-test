import java.util.Scanner;

/**
 * 
 *
 * 1. lt와 rt가 가리키는 것이 알파벳인지 특수문자인지 구분
 * 2. 알파벳이면 뒤집고, 특수문자이면 건너뛰기
 * 
 *
 */

public class String5 {
	public String solution(String str){
		String answer = "";
		char[] s = str.toCharArray();
		int lt = 0; 	int rt = str.length() - 1;
		
		while (lt < rt) {
			//(1)
			if (!Character.isAlphabetic(s[lt])) {	
				lt++;
			}else if (!Character.isAlphabetic(s[rt])) {
				rt--;
			}else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++; 	rt--;
			}
		}
		
		answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args){
    	String5 T = new String5();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        System.out.println(T.solution(str));
        

    }
}
