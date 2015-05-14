package com.designpatterns.create.singleton_03;

import java.util.Vector;

/**
 * 
 * 采用"影子实例"的办法为单例对象的属性同步更新
 * 因为我们只需要在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字，也是可以的：
 * @author miaowei
 *
 */
public class SingletonTest {
	
	private static SingletonTest instance = null;  
    private Vector properties = null;  
	
    public Vector getProperties() {  
        return properties;  
    }  
  
    private SingletonTest() {  
    }
    
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new SingletonTest();  
        }  
    }
    
    public static SingletonTest getInstance() {  
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }
    
    public void updateProperties() {  
        SingletonTest shadow = new SingletonTest();  
        properties = shadow.getProperties();  
    }
}
