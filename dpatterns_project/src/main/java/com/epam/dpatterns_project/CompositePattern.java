package com.epam.dpatterns_project;
import java.util.ArrayList;
import java.util.List;
public class CompositePattern {
	private String name;
	private String dept;
	private int salary;
	private List<CompositePattern> com;
	public CompositePattern(String name,String dept,int sal) {
	    this.name = name;
	    this.dept = dept;
	    this.salary = sal;
	    com=new ArrayList<CompositePattern>();
	}
	public void insert(CompositePattern c) {
		com.add(c);
	}
	public void delete(CompositePattern c) {
	    com.remove(c);
	}
	public List<CompositePattern> get(){
	    return com;
	}
	public String toString(){
	    return ("Lecturer:[Name:"+name+",dept:"+dept+",salary:"+salary+"]");
	}
}
