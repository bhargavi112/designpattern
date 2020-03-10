package com.epam.dpatterns_project;

public class TemplatePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Cloth c=new Nylon();
	     c.type();
	     System.out.println();
	     c=new Silk();
	     c.type();
	}

}
