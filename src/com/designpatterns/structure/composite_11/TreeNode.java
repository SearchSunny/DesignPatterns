package com.designpatterns.structure.composite_11;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 组合模式
 * 
 * @author miaowei
 * 
 */
public class TreeNode {

	private String name;
	private TreeNode parent;

	private Vector<TreeNode> childrenNodes = new Vector<TreeNode>();

	public TreeNode(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode getParent() {
		return parent;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	/**
	 * 添加子节点
	 * @param node
	 */
	public void add(TreeNode node){
		
		childrenNodes.add(node);
	}
	/**
	 * 删除子节点
	 */
	public void remove(TreeNode node){
		
		childrenNodes.remove(node);
		
	}
	/**
	 * 取得子节点
	 * @return
	 */
	public Enumeration<TreeNode> getChildren(){
		
		return childrenNodes.elements();
	}
}
