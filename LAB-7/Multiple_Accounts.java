package lab7;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Multiple_Accounts {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("How many accounts would you like to create?");
int num = input.nextInt(); String[] names = {"First", "Second", "Third"};
ArrayList<Account> owner = new ArrayList<Account>();
for (int i=0; i<num; i++)
{
System.out.print("Account Names: "); names[i] = input.next(); owner.add(new Account(100, names[i]));
}
input.close();
System.out.println(Account.getNumAccounts());
for (int i=0; i<num; i++)
{
System.out.print("Account " + (i+1) + " is ");
System.out.println(owner.get(i));
}
System.out.print("");
owner.get(0).close();
Account consolidatedAcc = Account.consolidate(owner.get(1), owner.get(2));
System.out.print("New account is ");
System.out.println(consolidatedAcc);
System.out.println(Account.getNumAccounts());
for (int i=0; i<num; i++)
{
System.out.print("Account " + (i+1) + " is ");
System.out.println(owner.get(i));
}
System.out.print("New account is ");
System.out.println(consolidatedAcc);
}
}
class Account
{
private static int numAccounts;
private double balance;
private String Name;
private long accountNum;
// Overloaded Constructors
public Account(double initBal, String owner, long number)
{

balance = initBal;
Name = owner;
accountNum = number;
numAccounts++;
}
public Account(double initialBal, String owner)
{
balance = initialBal;
Name = owner;
Random rand = new Random();
accountNum = rand.nextInt(1001);
numAccounts++;
}
public Account(String owner)
{
Name = owner;
balance = 0;
Random rand = new Random();
accountNum = rand.nextInt(1001);
numAccounts++;
}
public Account()
{
balance = 0;
Name = " ";
accountNum = 0;
numAccounts++;
}
// overloaded Method to withdraw Money
public void withdraw(double amount)
{
if (balance >= amount)
balance -= amount;
else
System.out.println("Insufficient funds");
}
public void withdraw(double amount, double fee)
{
if (amount <= 0 || fee<=0)
System.out.println("Error! Amount or fee can not be less than zero.");
else
{
double totalAmount = amount + fee;
if (balance >= totalAmount)
balance -= totalAmount;
else
System.out.println("Insufficient funds");
}
}
//Method to Deposit Money
public void deposit(double amount)
{
balance += amount;
}

// Method to check balance
public double getBalance()
{
return balance;
}
// Method to check number of accounts
public static int getNumAccounts()
{
System.out.print("No. of Accounts created: ");
return numAccounts;
}
// Method to close account
public void close()
{
Name += "Closed";
balance = 0;
numAccounts--;
}
// Method to Consolidate Account public static Account consolidate(Account acct1, Account acct2)
{
if (acct1.Name.equals(acct2.Name) && acct1.accountNum != acct2.accountNum)
{
Account acct3 = new Account();
acct3.Name = acct1.Name;
acct3.balance = acct1.balance + acct2.balance;
acct3.accountNum = acct2.accountNum + 1;
acct1.close();
acct2.close(); return acct3;
}
else
{
System.out.println("Error! For consolidation Account owner must be the same and must have two different accounts."); return null;
}
}
public String toString()
{
return "Name:" + Name +
"\nAccount Number: " + accountNum +
"\nBalance: " + balance;
}
public static String numAccounts() {
return null;
}