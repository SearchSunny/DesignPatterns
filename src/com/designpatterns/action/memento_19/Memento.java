package com.designpatterns.action.memento_19;
/**
 * 19、备忘录模式（Memento）
 * Memento类是备忘录类
 * @author miaowei
 *
 */
public class Memento {

	private String value;
	
	/**
	 * Memento类是备忘录类
	 */
	public Memento(String value) {
		
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
