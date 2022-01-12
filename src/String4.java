import java.util.*;

/**
 * 
 *
 * 1. 입력받은 문자열 배열에 넣기
 * 2. 뒤집기
 * 		(1) StrigBuilder의 reverse() 메소드
 * 		(2) 코드로 직접 뒤집기 (문자열에서 특정 문자만 뒤집을 때도 사용)
 *
 */

public class String4 {
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		
		// (1)
//		for (String x:str) {
//			String tmp = new StringBuilder(x).reverse().toString();		//String을 사용시 새로운 객체를 생성해 메모리 낭비 발생
//			answer.add(tmp);
//		}
		
		// (2)
		for(String x:str) {
			char[] s = x.toCharArray();
			int lt = 0;			int rt = x.length()-1;
			
			while(lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++; rt--;
			}
			
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
		
        return answer;
    }

    public static void main(String[] args){
    	String4 T = new String4();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str=new String[n];
        for(int i =0; i<n; i++) {
        	str[i] = scan.nextLine();
        }
        
        for (String x: T.solution(n, str) ) {
        	System.out.println(x);
        }

    }
}
