package lab2;
//imported the scanner class
import java.util.Scanner;
public class Efficiency {
public static void main(String[] args) {
//created a new scanner object
Scanner input = new Scanner(System.in);
System.out.println("Miles Traveled: ");
double miles= input.nextDouble();
System.out.println("Enter Gallons of Fuel ");
double gallons= input.nextDouble();
//used formula to calculate efficiency
double mpg = miles/gallons;
//printing out the result on console
System.out.println("Hence Fuel Efficiency is = " + mpg + " mpg" );
}
}