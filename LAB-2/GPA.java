package lab2;
import javax.swing.JOptionPane;
public class GPA {
public static void main(String[] args) {
//declaring variables
String a;
String b;
double c;
int d;
a = JOptionPane.showInputDialog("Enter the Total Quality Points: ");
//converting string to double
c=Double.parseDouble(a);
b = JOptionPane.showInputDialog("Enter the Total Credits: ");
d=Integer.parseInt(b);
double gpa=c/d;
JOptionPane.showMessageDialog(null," The GPA of student is "+ gpa,"GPA Calculator",JOptionPane.PLAIN_MESSAGE);
}
}