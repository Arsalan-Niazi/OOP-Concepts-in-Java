package lab7;
import java.util.Scanner;
import java.util.Random;
class Account {
Random rand=new Random();
private double balance;
private String name;
private long acctNum;
public Account(String owner) {
balance = 0;
name = owner;
acctNum = rand.nextInt(1000);
}
public Account(double initBal, String owner) {
balance = initBal;
name = owner;
acctNum = rand.nextInt(1000);
}
public Account(double initBal, String owner, long number) {
balance = initBal;
name = owner;
acctNum = number;
}
public void withdraw(double amount) {
if (balance >= amount)
balance -= amount;
else
System.out.println("Insufficient funds");
20-SE-56 MUHAMMAD ARSALAN
}
public void withdraw(double amount,double fee) {
if (balance >= amount)
balance -= (amount+fee);
else
System.out.println("Insufficient funds");
}
public void deposit(double amount) {
if(amount<0){
System.out.println("Invalid input. Negative Amount Can not be deposited");
}
else
balance += amount;
}
public double getBalance() {
return balance;
}
public String toString() {
return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
} }
public class Bank_Account {
public static void main(String[] args) {
String name;
double balance;
long acctNum;
Account acct,acct1,acct2;
Scanner scan = new Scanner(System.in);
System.out.println("Enter account holder's first name");
name = scan.next();
acct = new Account(name);
System.out.println("Account for " + name + ":");
System.out.println(acct);
20-SE-56 MUHAMMAD ARSALAN
System.out.println("\nEnter initial balance");
balance = scan.nextDouble();
acct1 = new Account(balance,name);
System.out.println("Account for " + name + ":");
System.out.println(acct1);
System.out.println("\nEnter account number");
acctNum = scan.nextLong();
acct2 = new Account(balance,name,acctNum);
System.out.println("Account for " + name + ":");
System.out.println(acct2);
System.out.print("\nDepositing 100 into account, balance is now ");
acct2.deposit(100);
System.out.println(acct2.getBalance());
System.out.print("\nWithdrawing $25, balance is now ");
acct2.withdraw(25);
System.out.println(acct2.getBalance());
System.out.print("\nWithdrawing $25 with $2 fee, balance is now ");
acct2.withdraw(25,2);
System.out.println(acct2.getBalance());
System.out.println("\nBye!");
} }