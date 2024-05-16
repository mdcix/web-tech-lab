import java.util.Scanner;
public class FiveNums{
    public static void main(String args[]){
        int large, small, temp;
        System.out.print("Enter number : ");
        Scanner scan = new Scanner(System.in);
        temp = scan.nextInt();
        large = temp;
        small = temp;
        for(int i=0; i<4; i++){
            System.out.print("Enter number : ");
            temp = scan.nextInt();
            if(temp<small){
                small = temp;
            }
            if (temp>large){
                large = temp;
            }
        }
        System.out.println("Largest number = " + large);
        System.out.println("Smallest number = " + small);
        scan.close();
    }
}