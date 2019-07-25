import java.util.*;

public class BST <K extends Comparable<K>, V>{
	private Node root; //Node 형 변수 root 선언
	
	private class Node{
		private K key;
		private V val;
		private Node left, right;
		private boolean color;
		public Node(K key, V val, boolean color){
			this.key = key;
			this.val = val;
			this.color = color;
		}
	}
	
	public BST(){
	}

	private V search(Node x, K key){
		if(x == null) return null;
		int cmp = key.compareTo(x.key);
		if(cmp < 0) return search(x.left, key);
		else if (cmp > 0) 
			return search(x.right, key);
		else
			return x.val;
	}
	
	public V search	(K key){
		return search(root, key);
	}
	private Node insert(Node x, K key, V val){
		if(x == null) return new Node(key, val, true);
		int cmp = key.compareTo(x.key);
		if(cmp < 0) x.left = insert(x.left, key, val);
		else if (cmp > 0) x.right = insert(x.right, key, val);
		else x.val = val;
		x = repair(x);
		return x;
	}
	
	private Node repair(Node h) {//수선 알고리즘 메소드
		if(h.right != null)
			if(h.right.color == true) h = rotateLeft(h);
		if(h.left != null && h.left.left != null)
			if(h.left.color == true && h.left.left.color == true) h = rotateRight(h);
		if(h.left != null && h.right != null)
			if(h.left.color == true && h.right.color == true) flipColors(h);
		return h;
	}

	public void insert(K key, V val){
		root = insert(root, key, val); //root가 널이면 메소드 안에서 처리한다. -> new node에 key value쌍을 반환
	}
	
	public Iterable<K> leverOrder(){
		Queue<K> keys = new LinkedList<K>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node x = queue.remove();
			if(x == null) continue;
			keys.add(x.key);
			queue.add(x.left);
			queue.add(x.right);
		}
		return keys;
	}
	
	public Node rotateLeft(Node h){
		Node x = null;
		x = h.right;
		h.right = x.left;
		x.left  = h;
		x.color = h.color;
		h.color = true;
		return x;
	}
	
	public Node rotateRight(Node h){
		Node x = null;
		x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = true;
		return x;
	}
	
	public void flipColors(Node h){
		h.color = true;
		h.left.color = false;
		h.right.color = false;
	}

}
