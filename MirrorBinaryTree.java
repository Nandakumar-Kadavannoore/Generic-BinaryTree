package me.start.binarytree;
/**
 * 
 * @author Nandakumar_K
 *
 * Implementation of Binary Tree using Generic
 */

/*
 * Class for each node in Tree
 */
class Node<T>{
	T data;
	Node<T> left;
	Node<T> right;
	Node(T key){
		this.data = key;
		left = right = null;
	}
}

/*
 * Class for Binary Tree 
 */
class BinaryTree<T>{
	Node<T> root;
	BinaryTree(T key){
		root = new Node<>(key);
	}
	BinaryTree(){
		root = null;
	}
}

/*
 * Main Class for Execution
 */
public class MainClass {
	
	// To Convert Tree into Mirror Tree
	static <T> Node<T> mirror(Node<T> node) {
		if (node == null)
			return node;

		// Get left and right subTree
		Node<T> left = mirror(node.left);
		Node<T> right = mirror(node.right);

		// Swap left and right trees
		node.left = right;
		node.right = left;

		return node;
	}
	
	// Perform InOrder Traversal
	static <T> void printInOrder(Node<T> node){
		if(node == null)
			return;
		
		printInOrder(node.left);
		System.out.println(" "+node.data);
		printInOrder(node.right);
	}
	
	public static void main(String[] args) {
	  
		BinaryTree<String> binaryTreeString =  new BinaryTree<>(); // Creating BinaryTree Object of String Type
		binaryTreeString.root = new Node<>("Hi");
		binaryTreeString.root.left = new Node<>("welcome");
		binaryTreeString.root.right = new Node<>("Java");
		
		System.out.println("Before Mirroring String Tree !");
		
	    printInOrder(binaryTreeString.root);	// Testing InOrder Traversal
	    
	    binaryTreeString.root = mirror(binaryTreeString.root);
	    
	    System.out.println("After Mirroring String Tree !");
	    
	    printInOrder(binaryTreeString.root);   // Testing Output
	    	    
	    BinaryTree<Integer> binaryTreeInteger = new BinaryTree<>();  // Creating BinaryTree Object of Integer Type
	    binaryTreeInteger.root = new Node<>(12);
	    binaryTreeInteger.root.left = new Node<>(23);
	    binaryTreeInteger.root.right = new Node<>(34);
	    
	    System.out.println("Before Mirroring Integer Tree !");
	    
	    printInOrder(binaryTreeInteger.root); 
	    
	    binaryTreeInteger.root = mirror(binaryTreeInteger.root);
	    
	    System.out.println("After Mirroring Integer Tree !");
	    
	    printInOrder(binaryTreeInteger.root); //Testing Output
	    
	
	}	

}
