package lab3;
import java.util.Scanner;
public class travel_cost {
public static void main(String[] args) {
//created a new scanner object
Scanner input = new Scanner(System.in);
System.out.println("Enter The Starting City: ");
String start= input.nextLine();
20-SE-56 MUHAMMAD ARSALAN
System.out.println("Enter The Ending City: ");
String end= input.nextLine();
System.out.println("Enter Distance in miles between two cities: ");
int dis_mile= input.nextInt();
System.out.println("Enter the cost of Travel per Mile: ");
double cost_mile= input.nextDouble();
//converting answer into int data type
int cost_travel=(int)(dis_mile*cost_mile);
System.out.println("The cost of Travelling From "+start +" to "+end+" is "+cost_travel+"$");
}
}