import java.util.*;


/**
 * @author YJ
 *
 * 1. 입력받은 문자열과 문자를 대문자 혹은 소문자로 변환
 * 2. for문을 통해 문자열과 문자를 비교하여 개수 세기
 *
 */

class String1{
    public int solution(String str, char t){
        int answer=0;

        // 1.
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        // 2.
//        for (int i=0; i<str.length(); i++) {
//            if(str.charAt(i) == t)	answer++;
//        }
        for (char x : str.toCharArray()) {
        	if(x == t)	answer++;
        }

        //System.out.println(answer);
        return answer;
    }

    public static void main(String[] args){
    	String1 T = new String1();
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        char ch = scan.next().charAt(0);

        System.out.print(T.solution(str, ch));
    }
}