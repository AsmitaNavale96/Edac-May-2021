/*Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

import java.util.Scanner;
 
 class Average
 {
  public static void main(String args[]) 
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Input first number: ");
	  int a = sc.nextInt();
	  System.out.print("Input second number: ");
	  int b = sc.nextInt();
	  System.out.print("Input third number: ");
	  int c = sc.nextInt();
	  int sum = a + b + c;
	  float avg = (float)sum/3;                           //typeconversion
	  System.out.println("sum of numbers: "+sum);
	  System.out.println("average of numbers: "+avg);
  }
 
}
