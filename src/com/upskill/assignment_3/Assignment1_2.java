package com.upskill.assignment_3;

public class Assignment1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//* Problem 2.	Write a java program which will display 5 employee information (name, age, salary and address). */
	


		myMethod(103);
	}
	
    public static void myMethod(int Marks){
    if(Marks>=90 && Marks<=100){	
    	    System.out.println("Grade A");}
        else if(Marks>=80 && Marks<=89){
    	    System.out.println("Grade B");}
        else if(Marks>=70 && Marks<=79){
   	    System.out.println("Grade C");}
        else if(Marks>=60 && Marks<=69){
    		System.out.println("Grade D");}
        else if(Marks<60){
           System.out.println("Fail");}
        else  {
    System.out.println("Invalid number");}
   
       }


	}



