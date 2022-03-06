import java.util.*;

class Lecture implements Comparable<Lecture>{
	int money, time;
	
	Lecture(int money, int time){
		this.money = money;
		this.time = time;
	}
	
	@Override
	public int compareTo(Lecture o) {
		return o.time-this.time;
	}
}

public class Greedy4 {
	static int n,max=Integer.MIN_VALUE;
	 
	public int solution(ArrayList<Lecture> arr) {
		int answer=0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());	// 큰 값 우선의 PQ 
		Collections.sort(arr);
		int j=0;
		for(int i=max; i>=1; i--) {
			for( ; j<n; j++) {
				if(arr.get(j).time < i)
					break;
				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty())
				answer+=pQ.poll();
		}
		return answer;
	}

	public static void main(String[] args) {
		Greedy4 T = new Greedy4();
		Scanner scan = new Scanner(System.in);
		ArrayList<Lecture> arr = new ArrayList<>();
		
		n = scan.nextInt();
		for(int i=0;i<n;i++) {
			int m = scan.nextInt();
			int d = scan.nextInt();
			arr.add(new Lecture(m,d));
			
			if(d>max)
				max=d;
		}
		System.out.println(T.solution(arr));
	}
}
