package com.upskill.java_2;

public class Loops {

	/* 
   Type of Loop
	       1.For Loop
	       2.While Loop
	       3.Do While Loop
	       4.Infinite Loop


*/
	  public static void main(String[] args) {
		//practiceForLoop();
		//practiceWhileLoop();
		  //practiceDoWhileLoop();
		  practiceInfiniteLoop();
		 // practiceNesteLoop();
		  
		
	}
 public static void practiceForLoop(){                    //For Loop - Do again and again upto upper limit
  int i;                                                  //Initialize the variable
  for(i = 10; i>=1; i--){                                 //Setting lower limit, Upper limit, Increment or Decrement
   System.out.println("For Loops number = " + i);         //Statement
  }
 }

  public static void practiceWhileLoop(){                 //While Loop - Do again and again upto condition match
	  int i = 1;                                          //Initialize the variable
	  while(i<=10){                                       //Setting condition
		  System.out.println("While Loops number = " + i); // Statement
		  i++;                                             // Increment or decrement
	  }
  }
   public static void practiceDoWhileLoop(){                     // Do While loop - Do action then match condition
	   int i = 1;                                                // Initialize the variable
	   do{
		   System.out.println("Do While loops number = " + i);   //statement
		   i++;                                                  // Increment or Decrement
		   }while (i<=0);                                  
   
   
 }
     public static void practiceInfiniteLoop(){                  // Infinite Loop - never ending Loop
    	 int i;                                                  // Initialize the variable
    	 for (i=1; ; i++){                                       //statement
    		 System.out.println("Infinite loops number = " + i); // Increment or Decrement
    	 }
     }
     public static void practiceNesteLoop(){                    // Nested Loop- Loop inside another Loop
    	 int i;                                                 // Initialize  the variable
    	 int j;                                                 //statement
    	                                                        // Increment or Decrement
    	 for (i=1; i<=10; i++){
    		 for (j=1; j<=10; j++){
    			 int multipicationTable =i * j;
    			 System.out.print(multipicationTable + " ");
    			 
    		 }
    		 
    		 System.out.println(" ");
    	 }
     }
 }
     
 