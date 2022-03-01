import java.util.*;

class Time implements Comparable<Time>{
	int s,e;
	
	public Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Time object) {
		if(this.e==object.e)
			return this.s-object.s;
		else
			return this.e-object.e;
	}
}

public class Greedy2 {

	public static void main(String[] args) {
		ArrayList<Time> arr = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int s,e;
		for(int i=0;i<n;i++) {
			s = scan.nextInt();
			e = scan.nextInt();
			arr.add(new Time(s,e));
		}
		
		int cnt=0,et=0;
		Collections.sort(arr);
		for(Time t:arr) {
			if(t.s>=et) {
				cnt++;
				et = t.e;
			}
		}
		System.out.println(cnt);
	}
}
