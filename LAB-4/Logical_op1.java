package lab4;
public class Logical_op1 {
public static void main(String[] args) {
int a=10;
int b=5;
//PART-1
//creating int variables where left and right shifts are calculated
int shift_left=a<<2;
int shift_right=b>>2;
int sum=shift_left+shift_right;
System.out.println("(a<<2)+(b>>2)="+sum);
//PART-2
boolean answ=(b>0);
System.out.println("(b>0)="+answ);
//PART-3
System.out.println("(a+b*100)/10="+(a+b*100)/10);
//PART-4
System.out.println("a&b="+(a&b));
}
}