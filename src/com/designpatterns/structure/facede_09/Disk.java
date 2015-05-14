package com.designpatterns.structure.facede_09;
/**
 * 9、外观模式（Facade）
 * 我们以一个计算机的启动过程为例
 * @author miaowei
 *
 */
public class Disk {

	public void startup(){
		
		System.out.println("disk startup");
	}
	
	public void shutdown(){
		
		System.err.println("disk shutdown!");
	}
}
