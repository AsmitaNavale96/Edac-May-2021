/*Write a Java program to convert a decimal number to hexadecimal number*/
import java.util.Scanner;
 class DecimaltoHexadecimal 
 {
      public static void main(String args[])
    {
        int decnum, rem;
        String hextodecnum = "";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        decnum = sc.nextInt();
		
        while(decnum>0)
        {
            rem = decnum % 16;
            hextodecnum = hex[rem] + hextodecnum;
            decnum = decnum / 16;
        }
        System.out.print("Hexadecimal number is : "+hextodecnum);         
    }
}
