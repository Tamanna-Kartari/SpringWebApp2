package org.nlt.services;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface ParentServices {
	public final SessionFactory sf= getSessionFactory();
	public final Session ses= getSessionFactory();
	 
	public static getSessionFactory()
	{
		
	}

}
