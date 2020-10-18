package com.trees;

public class TreeNode {
	private int data;
	private TreeNode left;
	private TreeNode right;

	public TreeNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public void insert(int value) {
		if (data == value) {
			return;
		}
		if (value < data) {
			if (left == null) {
				left = new TreeNode(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new TreeNode(value);
			} else {
				right.insert(value);
			}
		}
	}

	public void inorderTraversal() {
		if (left != null) {
			left.inorderTraversal();
		}
		System.out.print(data + " ");
		if (right != null) {
			right.inorderTraversal();
		}
	}

	public boolean search(int value) {
		if (value == data) {
			return true;
		}
		if (value < data) {
			if (left != null) {
				return left.search(value);
			}
		} else {
			if (right != null) {
				return right.search(value);
			}
		}
		return false;
	}
	
}
