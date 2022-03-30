import java.util.*;

public class Stack5 {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char tmp = str.charAt(i);
			if(tmp == '(') 
				stack.push(tmp);
			else {
				stack.pop();
				
				if(str.charAt(i-1) == '(') 
					answer += stack.size();
				else 	// ')'인 경우
					answer++;
				
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Stack5 T = new Stack5();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.solution(str));
	}

}
