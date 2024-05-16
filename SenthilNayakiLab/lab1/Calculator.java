import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        int n1, n2, sum, dif, pro, quo, rem;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        n1 = scan.nextInt();
        System.out.print("Enter second number : ");
        n2 = scan.nextInt();
        sum = n1+n2;
        dif = n1-n2;
        pro = n1*n2;
        quo = n1/n2;
        rem = n1%n2;
        System.out.println("Sum is " +  sum);
        System.out.println("Difference is " +  dif);
        System.out.println("Product is " +  pro);
        System.out.println("Quotient is " +  quo);
        System.out.println("Remainder is " +  rem);
        scan.close();
    }
}