package com.designpatterns.structure.proxy_08;
/**
 * 代理类
 * @author miaowei
 *
 */
public class Proxy implements Sourceable {

	private Source source;
	public Proxy() {
		
		this.source = new Source();
	}
	@Override
	public void method() {
		before();
		source.method(); 
		atfer();
	}
	
	private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    }

	
}
