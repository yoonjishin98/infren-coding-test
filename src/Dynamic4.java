import java.util.*;

class Brick implements Comparable<Brick>{
	int size;
	int height;
	int weight;
	
	Brick(int size, int height, int weight) {
		this.size = size;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Brick object) {
		return object.size-this.size;	// 내림차순
	}
}

public class Dynamic4 {
	public static int[] dy;
	
	public static int solution(ArrayList<Brick> arr) {
		int answer = 0;
		Collections.sort(arr);
		dy[0] = arr.get(0).height;
		answer = dy[0];
		
		for(int i=1; i<arr.size(); i++) {
			int max_height=0;
			for(int j=i-1; j>=0; j--) {
				if(arr.get(j).weight>arr.get(i).weight && dy[j]>max_height) {
					max_height = dy[j];
				}
				dy[i] = max_height + arr.get(i).height;
				answer=Math.max(answer, dy[i]);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Dynamic4 T = new Dynamic4();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Brick> arr = new ArrayList<>();
		dy = new int[n];
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			arr.add(new Brick(a,b,c));
		}
		System.out.println(T.solution(arr));
	}

}
