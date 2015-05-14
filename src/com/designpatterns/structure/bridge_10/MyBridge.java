package com.designpatterns.structure.bridge_10;

public class MyBridge extends Bridge {

	public void method() {
		getSource().method();
	}
}
