import java.util.*;

class Node{
	int data;
	Node lt, rt;	// 왼쪽 자식 노드, 오른쪽 자식 노드의 주소값이 저장됨
	public Node(int val) {
		data = val;
		lt=rt=null;
	}
}

public class DFS5 {
	Node root;
	public void DFS(Node root) {
		if(root == null)	return;
		else {
			//System.out.print(root.data + " ");	// 전위순회
			DFS(root.lt);
			System.out.print(root.data + " ");	// 중위순회
			DFS(root.rt);
			//System.out.print(root.data + " ");	// 후위순회
		}
	}
	
	public static void main(String args[]) {
		DFS5 tree = new DFS5();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);	// 말단 노드의 lt, rt는 null
		tree.root.lt.rt = new Node(5);	// "
		tree.root.rt.lt = new Node(6);	// "
		tree.root.rt.rt = new Node(7);	// "
		tree.DFS(tree.root); 

	}
	
}
