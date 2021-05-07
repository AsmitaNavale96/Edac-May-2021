/*Write a Java program to convert a binary number to hexadecimal number*/

class BinarytoHexadecimal
{
	public static void main(String args[])
	{
		long n=1101;
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
            String hextodecnum = "";
			char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			while(decimalnumber>0)
			{
				rem = decimalnumber % 16;
				hextodecnum = hex[(int)rem] + hextodecnum;
				decimalnumber = decimalnumber / 16;
			}
			System.out.print("Hexadecimal number is : "+hextodecnum);  
	}
}