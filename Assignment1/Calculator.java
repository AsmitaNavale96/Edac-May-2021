/*6.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125 Input second number: 24 Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
 
125 / 24 = 5
125 mod 24 = 5*/







/*import java.util.Scanner;
 
 class Calculator 
 {
 
 public static void main(String args[]) 
 {
  Scanner sc = new Scanner(System.in);
   
  System.out.print("Input first number: ");
  int a = sc.nextInt();
   
  System.out.print("Input second number: ");
  int b = sc.nextInt();
  int add=a+b; 
  int sub=a-b;
  int mul=a*b;
  int div=a/b;
  int rem=a%b;
  System.out.println("addition of numbers: "+add);
  System.out.println("subtraction of numbers: "+sub);
  System.out.println("multiplication of numbers: "+mul);
  System.out.println("division of numbers: "+div);
  System.out.println("modulus of numbers: "+rem);
 }
 
}*/

import java.util.Scanner;
class Calculator 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = sc.nextInt();
		System.out.print("Input first number: ");
		int b = sc.nextInt();
		System.out.println(a+ "+" +b+ "="+(a+b));
		System.out.println(a+ "-" +b+ "="+(a-b));
		System.out.println(a+ "*" +b+ "="+(a*b));
		System.out.println(a+ "/" +b+ "="+(a/b));
		System.out.println(a+ "%" +b+ "="+(a%b));
	}
 }
