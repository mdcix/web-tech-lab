import java.util.Scanner;
import java.lang.Math;
class SphereCal{
    double rad;
    double pi = 3.14;
    public double calcVolume(){
        
        return((4)*pi*Math.pow(rad,3))/3;
    }

    public double calcSurf(){
        return(4*pi*Math.pow(rad,2));
    }
}

public class Sphere {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    SphereCal sp = new SphereCal();
    System.out.print("Enter Radius of Sphere : ");
    sp.rad = scan.nextDouble();
    double vol = sp.calcVolume();
    double area = sp.calcSurf();
    System.out.format("Volume = %.4f\n", vol);
    System.out.format("Surface Area = %.4f\n", area);
    scan.close();
    }
}
