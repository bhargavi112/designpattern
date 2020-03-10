package com.epam.dpatterns_project;

public class StrategyObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy s=new Strategy(new Addition());		
	    System.out.println("5+4="+s.runStrategy(5,4));
	    s=new Strategy(new Subtraction());		
	    System.out.println("5-4="+s.runStrategy(5,4));
	}
}
