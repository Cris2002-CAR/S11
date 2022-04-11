package model;

public class Tree<T> {

	private Node root;

	public void add(T key, T value) {

		if (root == null) {

			root = new Node(key, value);
		} else {

			root.insert(key, value);
		}

	}

	// Activador del metodo recursivo
	public void triggerInOrder() {

		inorder(root);

	}

	// Recursivo
	public void inorder(Node node) {
		// Caso base
		if (node == null) {
			return;
		}

		// Recursivo
		inorder(node.getLeft());

		System.out.print(node.getKey() + ", ");

		inorder(node.getRight());

	}

	public Node triggerSearch(T key) {

		return search(root, key);

	}

	public Node search(Node node, T key) {

		if (node == null) {

			return null;

		}

		if (node.getKey() == key) {

			return node;
		}

		/////////// procedimientos

		if (key < node.getKey()) {

			return search(node.getLeft(), key);

		} else {

			return search(node.getRight(), key);
		}

	}

	public Node getMin(Node current) {

		if (current.getLeft() == null) {
			return current;
		} else {
			return getMin(current.getLeft());
		}
	}

	public Node getMax(Node current) {

		if (current.getRight() == null) {
			return current;
		} else {
			return getMin(current.getRight());
		}
	}

	public void triggerDelete(T key) {
		if (root != null) {
			root = delete(root, key);
		}

	}

	public Node delete(Node current, T key) {

		if (current.getKey() == key) {

			if (current.getLeft() == null && current.getRight() == null) {
				return null;
			} else if (current.getLeft() != null && current.getRight() != null) {
				
				Node sucess = getMin(current.getRight());
				
				Node newRightTree = delete(current.getRight(), sucess.getKey());
				
				sucess.setLeft(current.getLeft());
				sucess.setRight(newRightTree);
				
				return sucess;
				

			} else if (current.getLeft() != null) {

				return current.getLeft();
				
			} else  {

				return current.getRight();
			}

		} else if (key < current.getKey()) {

			Node newLeftTree = delete(current.getLeft(), key);
			current.setLeft(newLeftTree);

		} else {
			Node newRightTree = delete(current.getRight(), key);
			current.setRight(newRightTree);
		}

		return current;
	}
	
	//this
	public static <T extends Comparable> void comparar(T a, T b){
		int result = a.compareTo(b);
		if (result > 0) {
			System.out.println("a es mayor que b"+ a);
		} else if (result < 0) {
			System.out.println("a es menor que b");
		}else {
			System.out.println("a y b son iguales");
		}

	}

}
