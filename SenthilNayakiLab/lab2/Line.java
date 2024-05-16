import java.util.Scanner;

class Slope{
    int x1;
    int x2;
    int y1;
    int y2;

    public double getSlope(){
        return (y2-y1)/(x2-x1);
    }
}

public class Line {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Slope s = new Slope();
        System.out.print("Enter x1 : ");
        s.x1 = scan.nextInt();
        System.out.print("Enter y1 : ");
        s.y1 = scan.nextInt();
        System.out.print("Enter x2 : ");
        s.x2 = scan.nextInt();
        System.out.print("Enter y2 : ");
        s.y2 = scan.nextInt();
        double slope = s.getSlope();
        System.out.println("Slope = "+slope);
        scan.close();
    }
}
