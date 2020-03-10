package com.epam.dpatterns_project;

public class PrototypePattern {
	public Vehicle getType(String vType){
	      if(vType==null){
	         return null;
	      }		
	      if(vType.equalsIgnoreCase("CAR")){
	         return new Car();  
	      } 
	      else if(vType.equalsIgnoreCase("CHOPPER")){
	         return new Chopper();    
	      }
	      else if(vType.equalsIgnoreCase("TRAIN")){
	         return new Train();
	      }
	      return null;
	   }
}
