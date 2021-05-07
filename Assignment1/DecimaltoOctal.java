/*Write a Java program to convert a decimal number to octal number.*/

//method 1

/*class DecimaltoOctal
{
	public static void main(String args[])
	{
		int n=15;
		long octalnumber = 0;
		int rem, i=1;
		while(n != 0)
		{
			rem = n % 8;
			n /= 8;
			octalnumber += rem*i;
			i *=10;
		}
	System.out.println(octalnumber); 
	}
}*/

//method 2

class DecimaltoOctal
{
	public static void main(String args[])
	{
		int n=15;
		int octalnumber[] = new int[20];
		int rem, i=0;
		while(n > 0)
		{
			octalnumber[i] = n % 8;
			n /= 8;
			i = i + 1;
		}
		for(int j=i-1;i>=0;i--)
		{
			System.out.print(octalnumber[i]);
		}
	}
}