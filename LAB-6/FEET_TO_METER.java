package lab6;
import java.util.Scanner; //imported scanner class from java util.Scanner
class Meter { //created a user class named meter
double feet, meters;
public double feettoMeters(double meters) { //created a public method named feettoMeters to do conversion
if (feet>0)
{
meters=feet*0.3048;
}
else
{
feet=Math.abs(feet);
meters=feet*0.3048;
}
return meters;
}
}
public class FEET_TO_METER {
public static void main(String[] args) {
Meter metr= new Meter();
Scanner input=new Scanner(System.in);
System.out.print("ENTER MEASUREMENT IN FEET: ");
metr.feet=input.nextDouble();
double Meter=metr.feettoMeters(metr.meters);
System.out.print("RESULT IN METER WILL BE : " + Meter +"m");
}
}