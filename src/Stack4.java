import java.util.*;

public class Stack4 {
	public int solution(String str) {
		int answer = 0 ;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x))
				stack.push(Character.getNumericValue(x));
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				
				if(x=='+') {
					stack.push(lt+rt);
				}else if(x=='-') {
					stack.push(lt-rt);
				}else if(x=='*') {
					stack.push(lt*rt);
				}else
					stack.push(lt/rt);
			}
		}
		
		return answer=stack.pop();
	}

	public static void main(String[] args) {
		Stack4 T = new Stack4();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.solution(str));
	}

}
