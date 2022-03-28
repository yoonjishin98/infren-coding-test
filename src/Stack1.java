import java.util.*;

public class Stack1 {
	public String solution(String str) {
		String answer = "YES"; 
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c=='(')
				stack.push(c);
			else {
				if(stack.isEmpty())
					return answer="NO";
				stack.pop();
			}
		}
		
		if(!stack.isEmpty())
			return answer="NO";
		
		return answer;
	}

	public static void main(String[] args) {
		Stack1 T = new Stack1();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.solution(str));
	}

}
