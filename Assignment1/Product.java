/*Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25 Input second number: 5 Expected Output :
25 x 5 = 125*/



import java.util.Scanner;     //package which contains scanner class
 class Product 
	{
	 public static void main(String args[]) 
		{
			Scanner sc = new Scanner(System.in);            //systen.in to take input from keyboard
			System.out.print("Input first number: ");   
			int a = sc.nextInt();
			System.out.print("Input second number: ");
			int b = sc.nextInt();
			int c = a * b; 
			System.out.println("product of a and b: "+c);
		}
	}
