import java.util.Scanner;

class Numbers{
    int n1;
    int n2;
    int n3;

    public int calc(){
        return (n1*n2*n3)*(n1*n2*n3);
    }
}

public class SOP {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Numbers nums = new Numbers();
        System.out.print("Enter Number 1 : ");
        nums.n1 = scan.nextInt();
        System.out.print("Enter Number 2 : ");
        nums.n2 = scan.nextInt();
        System.out.print("Enter Number 3 : ");
        nums.n3 = scan.nextInt();
        int sop = nums.calc();
        System.out.println("Square of Product = "+sop);
        scan.close();
    }
}
