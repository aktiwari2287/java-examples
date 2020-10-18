package com.trees;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class Tree {

	private TreeNode root;
	private void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		}
		else {
			root.insert(value);
		}
	}
	
	private void inorder(TreeNode root) {
		if(root == null) {
			return;
		}
		else {
			inorder(root.getLeft());
			System.out.print(root.getData() + " ");
			inorder(root.getRight());
		}
	}
	private TreeNode getPrevNode(int value , TreeNode root, TreeNode prev) {
		if(root == null) return null;
		if(root.getData()==value) {
			return prev;
		}
		if(value<root.getData()) {
			return getPrevNode(value, root.getLeft(), root);
		}
		else {
			return getPrevNode(value, root.getRight(), root);
		}
	}
	
	private boolean delete(int value, TreeNode root) {
		TreeNode prevNode = getPrevNode(value, root, null);
		if(prevNode == null) {
			return false;
		}
		else {
			if(value<prevNode.getData()) {
				prevNode.setLeft(null);
			}
			else {
				prevNode.setRight(null);
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(25);
		tree.insert(20);
		tree.insert(27);
		tree.insert(15);
		tree.insert(22);
		tree.insert(26);
		tree.insert(30);
		tree.insert(29);
		tree.insert(32);
		tree.insert(17);
		//tree.root.inorderTraversal();
		System.out.println(tree.root.search(233));
		TreeNode prev = tree.getPrevNode(21,tree.root,null);
		System.out.println(tree.delete(17, tree.root));
		
		Queue<Integer> q = new LinkedBlockingQueue<>();
		
		
		tree.root.inorderTraversal();
	}

}
