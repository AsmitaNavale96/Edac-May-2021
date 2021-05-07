/*7.	Write a Java program that takes a number as input and prints its multiplication table upto 10.*/

import java.util.Scanner;
class Table 
{
	public static void main(String args[]) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Input a number: ");
	int num1 = sc.nextInt();
		for (int i=1; i< 10; i++)
		{
		System.out.println(num1 + " x " + i + " = " + (num1 * i));
		}
	}
}
