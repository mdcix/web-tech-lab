import java.util.Scanner;
public class Inputs {
    public static void main(String args[]){
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = scan.nextInt();
        if(num<10){
            System.out.println("1 digit number");
        }
        else if(num<100){
            System.out.println("2 digit number");
        }
        else if(num<1000){
            System.out.println("3 digit number");
        }
        else if(num<10000){
            System.out.println("4 digit number");
        }
        else if(num<100000){
            System.out.println("5 digit number");
        }
        else{
            System.out.println("Number of digits greater than 5");
        }
        scan.close();
    }
}
