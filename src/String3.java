import java.util.Scanner;

/**
 * @author YJ
 *
 * 1. 입력받은 문자열을 단어별로 나눠서 배열에 넣기
 * 2. for문을 사용해 처음부터 다음 단어의 길이와 비교하기 
 * 		(1) split()
 * 		(2) indexOf() + substring()
 *
 */

public class String3 {
	public String solution(String str){
		String answer = "";
		// (1)
//		int m = -1;
//		String[] arr = str.split(" ");
//		
//		for (String s:arr) {
//			int len = s.length();
//			
//			if(len > m) {
//				m = len;
//				answer = s;
//			}
//		}
		
		// (2)
		int m = Integer.MIN_VALUE, pos;
		while ((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			
			if (len >= m) {
				m = len;
				answer = tmp;
			}
			
			str = str.substring(pos + 1);
		}
		
		if (str.length() > m) 	answer = str;
		
        return answer;
    }

    public static void main(String[] args){
    	String3 T = new String3();
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();			// 주의!!! 엔터 치기 전 문장 전체를 받아야 하니까!

        System.out.print(T.solution(str));
    }
}
