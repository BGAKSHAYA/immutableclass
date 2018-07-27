/**.
 * This package contains an immutable class Student
 */
package com.immutableclass;

/**.
 * @author Akshaya_Gowri
 *
 */

public class Main {
	
	static void changeFieldOfStudent(Student newStudent) {  
		  String firstName = "Swathi";
	      if(firstName == newStudent.getFirstName()) {
	    	  System.out.println("The class is not immutable");
	      } else {
	    	  System.out.println("The class is immutable");
	      }
	}
	
	public static void main(String[] args) {
		/** id of Student.*/
	      int id = 1; 
	      /** age of Student.*/
	      int age = 21;
	      /** yearOfStudy of Student.*/
	      int yearOfStudy = 4;
	      /** firstName of Student.*/
	      String firstName = "Akshaya";
	      /** lastName of Student.*/
	      String lastName = "B G";
	      /** department of Student.*/
	      String department = "CSE";
	      /** gender of Student.*/
	      String gender = "Female";
	      
	      Student newStudent = new Student(firstName, lastName, gender, age, department, yearOfStudy, id);
	      
	      
	      //ALL THE FIELDS OF STUDENT ARE IMMUTABLE
	      
	      changeFieldOfStudent(newStudent);
	      
	    	  
	}

}

