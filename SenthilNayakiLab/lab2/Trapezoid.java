import java.util.Scanner;
class Shape{
    double a;
    double b;
    double h;
    public double calcArea(){
        return(((a+b)*h)/2);
    }
}
public class Trapezoid{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    Shape trap = new Shape();
    System.out.print("Enter Side 1 : ");
    trap.a = scan.nextDouble();
    System.out.print("Enter Side 2 : ");
    trap.b = scan.nextDouble();
    System.out.print("Enter Height : ");
    trap.h = scan.nextDouble();
    double res = trap.calcArea();
    System.out.println("Area = "+res);
    scan.close();
    }
}
