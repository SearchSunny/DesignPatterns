package com.designpatterns.structure.proxy_08;
/**
 * 代理模式测试类
 * @author miaowei
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		Sourceable source = new Proxy();  
        source.method(); 
	}
}
