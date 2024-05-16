import java.util.Scanner;
import java.lang.Math;

class Exponent{
    int x;

    public double getPower(){
        return Math.exp(x);
    }
}
public class Power {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Exponent eobj = new Exponent();
        System.out.print("Enter Number : ");
        eobj.x = scan.nextInt();
        System.out.println("Result = "+eobj.getPower());
        scan.close();
    }
}
