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
	
	
	// To find maximum value in BinaryTree
	public static int findMaxValue(Node<?> node) {
		
		if (node == null) // Base case
			return Integer.MIN_VALUE;
		else {
			int currentMaximumValue = (int) node.data; // Current node value or root node value
			
			// Right and left subtree values
			int leftNodeValue = findMaxValue(node.left);
			int rightNodeValue = findMaxValue(node.right);
			
			// Compare right subtree value with current node value
			if(rightNodeValue > currentMaximumValue){
				currentMaximumValue = rightNodeValue;
			}
			// Compare left subtree value with current node value
		    if(leftNodeValue > currentMaximumValue) {
		    	currentMaximumValue = leftNodeValue;
		    }
		    return currentMaximumValue; // return value
		}
	}
	
	// To find minimum value in BinaryTree
	public static int findMinValue(Node<?> node) {
		if (node == null)
			return Integer.MAX_VALUE;
		else {
			int currentMinimumValue = (int) node.data;
			
			int leftNodeValue = findMinValue(node.left);
			int rightNodeValue = findMinValue(node.right);
			
			if(rightNodeValue < currentMinimumValue){
				currentMinimumValue = rightNodeValue;
			}
		    if(leftNodeValue < currentMinimumValue) {
		    	currentMinimumValue = leftNodeValue;
		    }
		    return currentMinimumValue;
		}
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
	  	    
	    BinaryTree<Integer> binaryTreeInteger = new BinaryTree<>();  // Creating BinaryTree Object of Integer Type
	    binaryTreeInteger.root = new Node<>(12);
	    binaryTreeInteger.root.left = new Node<>(23);
	    binaryTreeInteger.root.right = new Node<>(34);
	    
	    printInOrder(binaryTreeInteger.root); 
	    
	    System.out.println("The maximum value in Binary Tree is "+findMaxValue(binaryTreeInteger.root));
	    System.out.println("The minmium value in Binary Tree is "+findMinValue(binaryTreeInteger.root));
	    
	
	}	

}
