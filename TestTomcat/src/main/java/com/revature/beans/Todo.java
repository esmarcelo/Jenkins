package com.revature.beans;

import java.io.Serializable;

public class Todo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5631522861197123988L;
	private String name;
	private Integer priority;
	
	public Todo(String nm, Integer pr) {
		this.name = nm;
		this.priority = pr;
	}
	
	public Todo() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		System.out.println(this.name + " " + this.priority);
		return this.name + " " + this.priority;
	}
}
