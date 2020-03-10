package com.epam.dpatterns_project;

public class CompositeObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompositePattern cse=new CompositePattern("John","CSE",30000);
		CompositePattern ece=new CompositePattern("Robert","ECE",20000);
		CompositePattern it=new CompositePattern("Michel","IT",20000);
		CompositePattern mech=new CompositePattern("Laura","MECHANICAL",10000);
		CompositePattern civil=new CompositePattern("Bob","CIVIL",10000);
		CompositePattern chem=new CompositePattern("Laura","CHEMICAL",10000);
		CompositePattern csbs=new CompositePattern("Bob","CSBS",10000);
	    cse.insert(ece);
	    cse.insert(it);
	    ece.insert(chem);
	    ece.insert(csbs);
	    it.insert(mech);
	    it.insert(civil);
	    System.out.println(cse);   
	    for(CompositePattern cp:cse.get()) {
	       System.out.println(cp);  
	       for (CompositePattern cp1:cp.get()) {
	    	   System.out.println(cp1);
	       }
	    }		
	}
}
