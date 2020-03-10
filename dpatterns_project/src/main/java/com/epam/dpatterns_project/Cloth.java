package com.epam.dpatterns_project;

public abstract class Cloth {
	abstract void init();
	abstract void start();
	abstract void end();
	public final void type() {
	    init();
	    start();
	    end();
	}
}
