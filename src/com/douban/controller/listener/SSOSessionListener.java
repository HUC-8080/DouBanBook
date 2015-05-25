package com.douban.controller.listener;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * Application Lifecycle Listener implementation class SSOSessionListener
 *
 */
public class SSOSessionListener implements HttpSessionListener {
	
	private List<String> users = null;

    /**
     * Default constructor. 
     */
    public SSOSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    @SuppressWarnings("unchecked")
	public void sessionCreated(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    	HttpSession session = arg0.getSession();
    	
    	ServletContext context = session.getServletContext();
    	
    	this.users = (List<String>) context.getAttribute("online_user_list");
    	
    	String username = (String) session.getAttribute("username");
    	
    	Logger log = Logger.getGlobal();
    	
    	if(this.users.contains(username)){
    		log.info("此用户已经登陆");
    	}else{
    		log.info("此用户尚未登陆");
    		this.users.add(username);
    		context.setAttribute("online_user_list", this.users);
    	}
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    @SuppressWarnings("unchecked")
	public void sessionDestroyed(HttpSessionEvent arg0) {
        // TODO Auto-generated method stub
    	HttpSession session = arg0.getSession();
    	
    	ServletContext context = session.getServletContext();
    	
    	this.users = (List<String>) context.getAttribute("online_user_list");
    	
    	this.users.remove(session.getAttribute("username"));
    }
	
}
