import java.util.*;

// 최단 거리 문제는 원래 BFS가 정석. 
// 이유는 자식 노드가 하나만 있을 경우, 에러가 발생하기 때문.

public class DFS7 {
	Node root;
	
	public int DFS(int L, Node root) {
		if(root.lt==null && root.rt==null)	return L;
		else 	return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
	}
	
	public static void main(String args[]) {
		DFS7 tree = new DFS7();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);	
		tree.root.lt.rt = new Node(5);	
		System.out.println(tree.DFS(0,  tree.root));
	}
}
