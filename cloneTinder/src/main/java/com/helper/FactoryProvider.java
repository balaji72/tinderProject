package com.helper;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.loader.custom.Return;

public class FactoryProvider {

	public static SessionFactory factory ;
	public static   SessionFactory getFactory() {
		
	if(factory==null){
		factory=(SessionFactory) new Configuration().configure("hibernate.cfg.xml");
		
	}
	 
	return factory;
	}
	
	public void closeFactory() {
		if(factory.isOpen()) {
			factory.close();
		}
	}
}
