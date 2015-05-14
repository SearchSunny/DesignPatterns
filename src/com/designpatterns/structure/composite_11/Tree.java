package com.designpatterns.structure.composite_11;

import java.util.Enumeration;

public class Tree {

	TreeNode root = null;
	
	public Tree(String name) {
		
		root = new TreeNode(name);
	}
	
	public static void main(String[] args) {
		
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");  
        TreeNode nodeC = new TreeNode("C"); 
        nodeB.add(nodeC); 
        
        tree.root.add(nodeC);
        tree.root.add(nodeB);
        
        Enumeration<TreeNode> children = tree.root.getChildren();
        TreeNode nextElement = children.nextElement();
        
        System.out.println(nextElement.getName());
        System.out.println("build the tree finished!");
	}
}
