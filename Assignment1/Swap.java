/*Write a Java program to swap two variables*/

//Method1
/*class swap  
{
 public static void main(String args[]) 
 {
   int a, b, temp;
   a = 10;
   b = 17;
   System.out.println("Before swapping a: " +a);
   System.out.println("Before swapping b: " +b);
   temp = a;
   a = b;
   b = temp;   
  System.out.println("After swapping a:" +a);
  System.out.println("After swapping b:" +b);
 }
 }*/


//Method2
/*class swap  
{
 public static void main(String args[]) 
 {
   int a, b;
   a = 10;
   b = 17;
   System.out.println("Before swapping a: " +a);
   System.out.println("Before swapping b: " +b);
   a = a + b;
   b = a - b;
   a = a - b;   
  System.out.println("After swapping a:" +a);
  System.out.println("After swapping b:" +b);
 }
}*/

//Method3
/*class swap  
{
 public static void main(String args[]) 
 {
   int a, b;
   a = 10;
   b = 17;
   System.out.println("Before swapping a: " +a);
   System.out.println("Before swapping b: " +b);
   a = a * b;
   b = a / b;
   a = a / b;   
  System.out.println("After swapping a:" +a);
  System.out.println("After swapping b:" +b);
 }
}*/

//Method4

class swap  
{
 public static void main(String args[]) 
 {
   int a, b;
   a = 10;
   b = 17;
   System.out.println("Before swapping a: " +a);
   System.out.println("Before swapping b: " +b);
   a = a ^ b;
   b = a ^ b;
   a = a ^ b;   
  System.out.println("After swapping a:" +a);
  System.out.println("After swapping b:" +b);
 }
}
