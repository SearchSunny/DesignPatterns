package com.designpatterns.structure.facede_09;
/**
 * 9、外观模式（Facade）
 * 我们以一个计算机的启动过程为例
 * @author miaowei
 *
 */
public class Memory {

	public void startup(){
		
		System.out.println("memory startup!");
	}
	
	public void  shutdown() {
		
		System.err.println("memory shutdown!");
	}
}
