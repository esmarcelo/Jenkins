package com.revature.controllers;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.Todo;

public class ToDoServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6321404125770579507L;
	

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Todo todo = new Todo();
		todo.setName("Clean Room");
		todo.setPriority(0);
		
		// int i  = Integer.parseInt(req.getParameter("id"));
		/*
		if(i >= 10) {
			res.setStatus(404);
			return;
		}
		*/
		
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(todo);
		res.setHeader("Content Type", "application/json");
		mapper.writeValue(res.getOutputStream(), todo);
	
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		ServletConfig sc = getServletConfig();
		System.out.println(sc.getInitParameter("days"));
		
		System.out.println(getServletContext().getInitParameter("Age"));
		
		
		Todo newTodo = new ObjectMapper().readValue(req.getReader(), Todo.class);
		System.out.println(newTodo);
		
		
	}

}
