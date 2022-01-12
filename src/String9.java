import java.util.Scanner;

/**
 * 
 * 1. 문자의 각 알파벳을 배열에 넣기
 * 2. 숫자라면, 자연수로 만들기
 * 		(1) 아스키코드 이용
 * 		(2) isDigit 활용 (단, 나중에 parseInt로 변환 필요)
 * 
 */ 
 
public class String9 {
	public int solution(String str){
		//int answer = 0;
		String answer = "";
		
		for (char x : str.toCharArray()) {
			// (1)
//			if (x>=48 && x<=57)		// 숫자 아스키 코드: 48 ~ 57
//				answer = answer*10 + (x-48);
			
			// (2) 
			if (Character.isDigit(x)) 
				answer += x;
		}
		
        //return answer;
		return Integer.parseInt(answer);
    }

    public static void main(String[] args){
    	String9 T = new String9();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        System.out.println(T.solution(str));
    }
}
