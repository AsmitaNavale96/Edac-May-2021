/*Write a Java program to convert a decimal number to binary number*/

//Method 1
/*class DecimaltoBinary
{
	public static void main(String args[])
	{
		int n=5;
		long binarynumber = 0;
		int rem, i=1;
		while(n != 0)
		{
			rem = n % 2;
			n /= 2;
			binarynumber += rem*i;
			i *=10;
		}
	System.out.println(binarynumber);
	}
}*/

//Method 2

class DecimaltoBinary
{
	public static void main(String args[])
	{
		int n=5;
		int binarynumber[] = new int[20];
		int rem, i=0;
		while(n > 0)
		{
			binarynumber[i] = n % 2;
			n /= 2;
			i = i + 1;
		}
		for(int j=i-1;i>=0;i--)
		{
			System.out.print(binarynumber[i]);
		}
	}
}