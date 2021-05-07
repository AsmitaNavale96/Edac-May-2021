/*Write a Java program to convert a octal number to a decimal number.*/

import java.util.Scanner;
class OctaltoDecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("The Octal number is: ");
		long n = sc.nextLong();
		long decimalnumber = 0;
		long rem, i=1;
		while(n != 0) 
			{
				rem = n % 10;
				decimalnumber = decimalnumber + rem * i;
				i = i * 8;
				n = n / 10;
			}
	System.out.println("Decimal number is: " +decimalnumber); 
	}
}