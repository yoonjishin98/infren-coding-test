import java.util.*;

class P implements Comparable<P> {
	public int x,y;
	
	P(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(P object) {	// this -> object 순
		if(this.x==object.x)
			return this.y-object.y;	// 내림차순이든, 오름차순이든 빼서 음수가 나와야 함
		else
			return this.x-object.x;
	}
}

class Sorting7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<P> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			arr.add(new P(x,y));
		}
		
		Collections.sort(arr);
		for(P o:arr)
			System.out.println(o.x+" "+o.y);
	}

}
