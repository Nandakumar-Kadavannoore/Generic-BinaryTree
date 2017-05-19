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
	
	// Perform PostOrder Traversal
	static void printPostOrder(Node<?> node){
		if(node == null)
			return;
		
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(" "+node.data);
	}
	
	// Perform PreOrder Traversal
	static void printPreOrder(Node<?> node){
		if(node == null)
			return;
		
		System.out.println(" "+node.data);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	// Perform InOrder Traversal
	static void printInOrder(Node<?> node){
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
		
	    printInOrder(binaryTreeString.root);	// Testing InOrder Traversal
	    	    
	    BinaryTree<Integer> binaryTreeInteger = new BinaryTree<>();  // Creating BinaryTree Object of Integer Type
	    binaryTreeInteger.root = new Node<>(12);
	    binaryTreeInteger.root.left = new Node<>(23);
	    binaryTreeInteger.root.right = new Node<>(34);
	    
	    printInOrder(binaryTreeInteger.root);
	    
	
	}	

}
