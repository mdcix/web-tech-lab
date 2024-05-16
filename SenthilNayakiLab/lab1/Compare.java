import java.util.Scanner;

public class Compare{
    public static void main(String args[]){
        int n1, n2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number : ");
        n1 = scan.nextInt();
        System.out.print("Enter second number : ");
        n2 = scan.nextInt();
        if(n1>n2){
            System.out.println(n1 + " is greater than "+ n2);
        }
        else if(n1<n2){
            System.out.println(n1 + " is lesser than "+ n2);
        }
        else{
            System.out.println("Two numbers are equal");
        }
        scan.close();
    }
}