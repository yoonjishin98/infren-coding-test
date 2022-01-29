import java.util.*;

//class Node{
//	int data;
//	Node lt, rt;	// 왼쪽 자식 노드, 오른쪽 자식 노드의 주소값이 저장됨
//	public Node(int val) {
//		data = val;
//		lt=rt=null;
//	}
//}

public class BFS1 {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L=0;
		
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L +" : ");
			
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data+" ");
				
				if(cur.lt != null)	Q.offer(cur.lt);
				if(cur.rt != null)	Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		BFS1 tree = new BFS1();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);	// 말단 노드의 lt, rt는 null
		tree.root.lt.rt = new Node(5);	// "
		tree.root.rt.lt = new Node(6);	// "
		tree.root.rt.rt = new Node(7);	// "
		tree.BFS(tree.root); 

	}
}
