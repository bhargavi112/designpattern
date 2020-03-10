package com.epam.dpatterns_project;

public class Silk extends Cloth{
	@Override
	void end() {
	   System.out.println("Cloth work Finished!");
	}
	@Override
	void init() {
	   System.out.println("Stitching cloth Initialized!");
	}
	@Override
	void start() {
	   System.out.println("Stitching cloth Started!");
	}
}
