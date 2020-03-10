package com.epam.dpatterns_project;

public class SingletonPattern {
	private static SingletonPattern single = new SingletonPattern();
	   private SingletonPattern(){}
	   public static SingletonPattern getObj(){
	      return single;
	   }
	   public void display(){
	      System.out.println("Singleton Pattern is one of the simplest design pattern!");
	   }
}
