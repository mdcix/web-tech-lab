import java.util.Scanner;
public class Circle{
    public static void main(String args[]){
        int rad, dia;
        double area;
        System.out.print("Enter radius : ");
        Scanner scan = new Scanner(System.in);
        rad = scan.nextInt();
        dia = 2*rad;
        area = (22*rad*rad)/7f;
        System.out.println("Diameter is " + dia);
        System.out.println("Area is " + area);
        scan.close();
    }
}