package labJava;
//AUTHOR: Jessica Farias
//FILENAME: Lab2.java
//SPECIFICATION: using strings to enter a full name and change is to uppercase. Fing the length of the name. compare strings using equal method and use if-else statements.
//FOR: CSE 110 - Lab #2
//TIME SPENT: 1 hour 

import java.util.Scanner;
public class Lab2 
{
	public static void main(String[] args) 
	{
		
		// declare variables of different types:
		String firstName = "";
		String lastName = "";
		String fullName = "";
		int nameLength = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first name: "); // Use Scanner to ask the user for first name
		firstName = scan.nextLine();
		System.out.println("Please enter last name: "); // Use Scanner to ask the user for last name
		lastName = scan.nextLine();
		
		scan.close();
		
		fullName = firstName + lastName; //form the full name by adding the fistName and LastName
		//convert fullName to upper case
		fullName = fullName.toUpperCase(); //convert fullname to uppercase
		//print out the full name and length
		nameLength = fullName.length(); //find the lenght the full name
		
		System.out.println(fullName); // Print fullName, it should be in upper case
		System.out.println(nameLength); // Print nameLength, this should be number of characters
		
		// Define two String variables, title1 and title2 using
		// String constructor to initialize them
		String title1 = new String("cse110");
		String title2 = "cse110";
		
		// Compare the two strings and print which one of the two ways works
		if ( title1 == title2 ) 
		{
		System.out.println("String comparison using '==' sign works"); // Print "String comparison using "==" sign works"
		// -->
		} 
		else 
		{
		System.out.println("String comparison using '==' sign does not work");// Print "String comparison using "==" sign does NOT work"
		// -->
		}
		if ( title1.equals(title2) ) 
		{ 
		System.out.println("String comparison using 'equals' method works");// print "String comparison using "equals" method works"
		// -->
		} 
		else 
		{
		System.out.println("String comparison using 'equals' method does not work"); // print "String comparison using "equals" method does NOT work"
		}
	}
}