package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;                                   //Variable
		int[] ageLoki = new int []{25, 30, 35, 38, 40}; //Array
		
		  // Array index      [0]  [1]  [2]  [3]  [4] 
		
          System.out.println("Student Age : " + ageLoki[4]);
          System.out.println("Total Student : " + ageLoki.length);
          
          String[] nameLoki =new String[]{"Pushirul", "Anik", "Marjan", "Jay", "Islam", "Mizu"};
          
          System.out.println("Student name : " + nameLoki[4]);
          System.out.println("Total Student name : " + nameLoki.length);
          
          //Multi Dimentional Array
          int [][] ageLoki2D = {{ 25, 30, 35, 38, 40}, //[0][0] [0][1] [0][2] [0][3] [0][4]
                                {67, 24, 51}};        //[0][1] [1][1] [1][2] [1][3] [1][4]
                                
            System.out.println("Student age 2D : " + ageLoki2D[0][3]);
            
            // HashMap store multiple data using key-value pair, Implementation of Map interface
            
            HashMap<String, Integer> Student = new HashMap<String, Integer>();
            
            Student.put("Pushirul",25);
            Student.put("Anik",31);
            Student.put("Marjan",28);
            Student.put("Jay",18);
            
            System.out.println("HashMap Student age : "+ Student.get("Marjan"));
            
            HashMap<String, String> capital = new HashMap<String, String>();
            
            capital.put("BD", "Dhaka");
            capital.put("USA", "Washington DC");
            
            System.out.println("Capital City : " + capital.get("BD"));
            
            //Hashset store unordered collection containing unique value, Implementation of set interface
            
            HashSet<String> car = new HashSet<String>();
            
            car.add("BMW");
            car.add("Toyota");
            car.add("audi");
            car.add("fort");
            
            System.out.println("car : " + car);
            
            //HashTable store multiple data using key-value pair, but is synchronized (one thread can be modified)
            
            Hashtable<String, String> Region = new Hashtable<String, String>(); 
            Region.put("BD", "Asia");
            Region.put("USA", "America");
            
            System.out.println("Region : " + Region.get("BD"));
            
            
            
            
            
}
}