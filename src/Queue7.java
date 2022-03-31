import java.util.*;

public class Queue7 {
	public String solution(String str1, String str2) {
		String answer = "NO";
		Queue<Character> queue = new LinkedList<>();
		
		for(char x : str1.toCharArray()) {
			queue.offer(x);
		}
		
		char tmp = queue.poll();
		for(int i=0; i<str2.length(); i++) {
			if(str2.charAt(i) == tmp) {
				if(queue.isEmpty()) {
					answer = "YES";
					break;
				}else
					tmp = queue.poll();
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Queue7 T = new Queue7();
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		System.out.println(T.solution(str1, str2));
	}

}
