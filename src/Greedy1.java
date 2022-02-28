import java.util.*;

class Body implements Comparable<Body>{ 
	int height, weight;
	
	public Body(int height, int weight) {
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Body object) {		// 키 기준 내림차순으로 정렬
		return object.height-this.height;
	}
}

public class Greedy1 {
	
	public int solution(ArrayList<Body> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		
		for(Body o:arr) {
			if(o.weight>max) {
				cnt++;
				max = o.weight;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Greedy1 T = new Greedy1();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			arr.add(new Body(h,w));
		}
		System.out.println(T.solution(arr,n));

	}

}
