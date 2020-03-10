package com.epam.dpatterns_project;

public class VehicleObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrototypePattern p=new PrototypePattern();
	      Vehicle type1=p.getType("CAR");
	      type1.retrieve();
	      Vehicle type2=p.getType("CHOPPER");
	      type2.retrieve();
	      Vehicle type3=p.getType("TRAIN");
	      type3.retrieve();
	   }
}
