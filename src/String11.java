import java.util.Scanner;

/**
 * 1. cnt = 1
 * 2. 문자열 알파벳끼리 비교하여 
 * 	  같으면, cnt++
 * 	  다르면, answer에 알파벳과 cnt를 더하고 + cnt 1로 초기화
 *  (단, 반복횟수가 1인 경우 생략 까먹지 말기)
 * 
 */ 
 
public class String11 {
	public String solution(String str){
		String answer = "";
		int cnt = 1;
		str = str + " ";
		
		for (int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1))	cnt++;
			else {
				answer += str.charAt(i);
				if(cnt>1)	answer +=String.valueOf(cnt);
				cnt = 1;
			}
		}
		
		return answer;
    }

    public static void main(String[] args){
    	String11 T = new String11();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
