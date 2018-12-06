package com.example.lambda;

public class Node {
	int val;
	Node node;
	
	public Node(int val, Node node) {
		super();
		this.val = val;
		this.node = node;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public Node getNode() {
		return node;
	}
	public void setNode(Node node) {
		this.node = node;
	}
	

}
