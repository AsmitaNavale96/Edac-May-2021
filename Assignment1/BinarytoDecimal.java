/*Write a Java program to convert a binary number to decimal number*/

class BinarytoDecimal
{
	public static void main(String args[])
	{
		long n=100;
		long decimalnumber = 0;
		long rem, i=1;
		while(n != 0) 
			{
				rem = n % 10;
				decimalnumber = decimalnumber + rem * i;
				i = i * 2;
				n = n / 10;
			}
	System.out.println(decimalnumber); 
	}
}