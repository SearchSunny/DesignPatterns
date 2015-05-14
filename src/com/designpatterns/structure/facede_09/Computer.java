package com.designpatterns.structure.facede_09;
/**
 * 9、外观模式（Facade）
 * 我们以一个计算机的启动过程为例
 * @author miaowei
 *
 */
public class Computer {

	private CPU cpu;
	
	private Memory memory;
	
	private Disk disk;
	
	public Computer () {
		cpu = new CPU();
		
		memory = new Memory();
		
		disk = new Disk();
	}
	
	public void startup(){
		
		System.out.println("start the computer!");
		
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start computer finished");
	}
	
	public void  shutdown() {
		
		System.err.println("begin to close the computer!");
		
		cpu.shutdown();
		
		memory.shutdown();
		disk.shutdown();
		System.err.println("computer closed!");
	}
}
