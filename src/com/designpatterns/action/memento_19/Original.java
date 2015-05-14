package com.designpatterns.action.memento_19;
/**
 * 19、备忘录模式（Memento）
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
 * @author miaowei
 *
 */
public class Original {

	private String value;
	
	/**
	 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
	 * @param value
	 */
	public Original(String value) {
	
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	/**
	 * 创建一个备忘录类
	 * @return
	 */
	public Memento createMemento() {
	
		return new Memento(value);
	}
	/**
	 * 
	 * @param memento
	 */
	public void restoreMemento(Memento memento) {
		
		this.value = memento.getValue();
	}
	
}
