import java.util.*;

public class Stack2 {
	public String solution(String str) {
		String answer = ""; 
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c==')') 
				while(stack.pop() != '(');
			else
				stack.push(c);
		}
		
		for(int i=0; i<stack.size(); i++)
			answer += stack.get(i);
		
		return answer;
	}

	public static void main(String[] args) {
		Stack2 T = new Stack2();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.solution(str));
	}

}
