package com.task8.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.task8.pojo.Bye;



public class Hi {
	 public boolean addUserDetails(int id,String userName, String password, String email,String    phone, String city) {
	        
		 boolean flag=true;
		 try {
	        	Configuration con = new Configuration();
	    		con.configure("hibernate.cfg.xml");
	    		SessionFactory f = con.buildSessionFactory();
	    		Session session = f.openSession();
	    		Transaction t = session.beginTransaction();
	            
	    		Bye user = new Bye();
	    		user.setId(id);
	            user.setUserName(userName);
	            user.setPassword1(password);
	            user.setEmail(email);
	            user.setCity(city);
	            user.setPhone(phone);
	            
	            session.save(user);
	            t.commit();
	            session.close();
	            System.out.println("\n\n Details Added \n");
	 
	        } catch (Exception e) {
	            System.out.println(e);
	            System.out.println("error");
	        }
			return flag;
}
}