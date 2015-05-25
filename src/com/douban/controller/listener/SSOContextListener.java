package com.douban.controller.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class SSOListener
 *
 */
public class SSOContextListener implements ServletContextListener {

	private List<String> users = null;
	
    /**
     * Default constructor. 
     */
    public SSOContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    	if(this.users == null){
    		this.users = new ArrayList<String>();
    	}
    	ServletContext context = arg0.getServletContext();
    	
    	context.setAttribute("online_user_list", this.users);
    	
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    	this.users.clear();
    	ServletContext context = arg0.getServletContext();
    	context.removeAttribute("online_user_list");
    }
	
}
