package com.epam.dpatterns_project;

public class FacadePattern {
	private Fruit mango;
	private Fruit apple;
	private Fruit banana;
	public FacadePattern() {
		mango = new Mango();
	    apple = new Apple();
	    banana = new Banana();
	}
	public void getMango(){
	    mango.getFruit();
	}
	public void getApple(){
	    apple.getFruit();
	}
	public void getBanana(){
	    banana.getFruit();
	}
}
