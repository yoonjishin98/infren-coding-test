import java.util.*;


public class HashMap1 {
	public char solution(int n, String str) {
		char answer= ' ';
		int max=Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x:str.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		for(char key:map.keySet()) {
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		HashMap1 T = new HashMap1();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		System.out.println(T.solution(n,str));
	}

}
