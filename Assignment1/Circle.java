/*11.	Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5 Expected Output
Perimeter is = 47.12388980384689 Area is = 176.71458676442586*/


import java.util.Scanner;
public class Circle
{
    public static void main(String args[]) 
    {
        double r;
        double pi = 3.14159, area, perimeter;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextDouble();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
		perimeter = 2 * pi * r;
		System.out.println("perimeter of circle:"+perimeter);
		
    }            
}