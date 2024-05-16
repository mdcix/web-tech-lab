import java.util.Scanner;
public class Oddeven {
    public static void main(String args[]){
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        num = scan.nextInt();
        if(num%2==0){
            System.out.println("Its an even number");
        }
        else{
            System.out.println("Its an odd number");
        }
        scan.close();
    }
}
