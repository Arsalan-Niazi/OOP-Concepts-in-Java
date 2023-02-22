package lab6;
class Rectangle { //Created a class name dRectangle
private double length, width;
//method to set length and width according to parameters
public void Parimeter_method(double length, double width) {
this.length=length;
this.width=width;
}
public double getlength() {
return this.length;
}
public double getwidth() {
return this.width;

}
public double Perimeter(double L, double W) {
return 2*L+2*W;
}
public double Area(double L, double W) {
return L*W;
}
}
public class Rect_Area {
public static void main(String[] args) {
Rectangle r= new Rectangle();
r.Parimeter_method(7.5, 2.6);
System.out.print("Rectangle Length: "+ r.getlength());
System.out.print("\nRectangle Width: "+ r.getwidth());
double p=r.Perimeter(r.getlength(),r.getwidth());
System.out.print("\nRectangle Perimeter: "+ p);
double A=r.Area(r.getlength(),r.getwidth());
System.out.print("\nArea of Rectangle: "+ A);
}
}