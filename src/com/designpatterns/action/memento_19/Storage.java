package com.designpatterns.action.memento_19;
/**
 * 19、备忘录模式（Memento）
 * Storage类是存储备忘录的类，持有Memento类的实例
 * @author miaowei
 *
 */
public class Storage {

	private Memento memento;
	/**
	 * Storage类是存储备忘录的类，持有Memento类的实例
	 * @param memento
	 */
	public Storage(Memento memento) {
		
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
