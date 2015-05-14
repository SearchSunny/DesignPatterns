package com.designpatterns.create.builder_04;

import java.util.ArrayList;
import java.util.List;

import com.designpatterns.create.aabstract.factory_02.MailSender;
import com.designpatterns.create.aabstract.factory_02.Sender;
import com.designpatterns.create.aabstract.factory_02.SmsSender;

/**
 * 建造者类
 * 建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，
 * 所谓复合对象就是指某个类具有不同的属性
 * 建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的
 * @author miaowei
 *
 */
public class Builder {

	private List<Sender> list = new ArrayList<Sender>();  
	
	public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }
	
	public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }
}
