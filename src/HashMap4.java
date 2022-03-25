import java.util.*;

public class HashMap4 {
	public int solution(String s, String t) {
		int answer=0;
		int lt = 0;
		HashMap<Character, Integer> smap = new HashMap<>();
		HashMap<Character, Integer> tmap = new HashMap<>();
		char[] arr = s.toCharArray();
		
		for(char x : t.toCharArray()) {
			tmap.put(x, tmap.getOrDefault(x, 0)+1);
		}
		for(int i=0; i<t.length()-1; i++) {
			smap.put(arr[i], smap.getOrDefault(arr[i], 0)+1);
		}
		for(int rt=t.length()-1; rt<s.length(); rt++) {
			smap.put(arr[rt], smap.getOrDefault(arr[rt], 0)+1);
			if(tmap.equals(smap)) {
				answer++;
				//System.out.println(tmap + " " + smap);	// {a=1, b=1, c=1} {a=1, b=1, c=1} 형식으로 나옴
			}
			smap.put(arr[lt], smap.getOrDefault(arr[lt], 0)-1);
			if(smap.get(arr[lt])==0)
				smap.remove(arr[lt]);
			lt++;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		HashMap4 T = new HashMap4();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		System.out.print(T.solution(s,t));
	}

}
