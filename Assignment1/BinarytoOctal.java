class BinarytoDecimal
{/*24.	Write a Java program to convert a binary number to a Octal number.*/
	public static void main(String args[])
	{
		long n=100;
		long decimalnumber = 0;
		long decimalnumber1;
		long rem, i=1;
		while(n != 0) 
			{
				rem = n % 10;
				decimalnumber = decimalnumber + rem * i;
				i = i * 2;
				n = n / 10;
			}
	    System.out.println(decimalnumber); 
	    decimalnumber1 = decimalnumber;
		long octalnumber[] = new long[20];
		int k = 0;
		while(decimalnumber > 0)
		{
			octalnumber[k] = decimalnumber % 8;
			decimalnumber /= 8;
			k = k + 1;
		}
		for(int j=k-1;k>=0;k--)
		{
			System.out.print(octalnumber[k]);
		}
	}
}