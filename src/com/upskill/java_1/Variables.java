  package com.upskill.java_1;

public class Variables {

// variables in java
	
	public String country = "UAS";  // Instance OR global variable- variable declared in class level, outside method

	
	public String country2 = "Russia";  
	
	
	public static String  region = "America";   // static variable - variable belong to class and don't required creating object
	
	public static void main(String[]args){
	
	     String city = "NEW YORK";      // Local variable - variable declared in methods
	    
	     method("Essex");
	     
}	    
	     public static void method(String county){  // Method parameter - variable used as method parameter 
	    	 
	    	 String city = "Bloomfild";
	    	 
	    	 String myCounty = county;
	
	     }
	     
	     public void test(){
	    	 
	    	 String city = "buffalo";
	}

}
