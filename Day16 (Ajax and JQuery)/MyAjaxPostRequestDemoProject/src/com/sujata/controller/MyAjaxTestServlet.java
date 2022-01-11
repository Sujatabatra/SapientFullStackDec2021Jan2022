package com.sujata.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyAjaxTestServlet
 */
public class MyAjaxTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Map<String,String> mpCityState;

    public MyAjaxTestServlet() {
        super();
        mpCityState = new HashMap<String,String>();
        
        mpCityState.put("Noida","UP");
        mpCityState.put("Gurugram","Haryana");
        mpCityState.put("Gwalior","MP");
        mpCityState.put("Shimla","HP");
        mpCityState.put("Patna","Bihar");
        
    }
//    private String handleRequest(String param){
//        
//        
//        return null;
//    }
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/xml");
        res.setHeader("Cache-Control", "no-store, no-cache");
        
        String city = "";
        if(req.getParameter("city") != null) 
        	city = req.getParameter("city").trim();    
        
        //value=map.get(key)
        String state = mpCityState.get(city);
        
        if(state!=null)    
        	res.getWriter().write(state);
        else 
        	res.getWriter().write("State not found for city");
	}

}
