import java.util.Scanner;
public class Count {
    public static void main(String args[]){
        int pos, neg, zer, temp;
        pos=neg=zer=0;
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.print("Enter number : ");
            temp = scan.nextInt();
            if(temp<0){
                neg+=1;
            }
            else if(temp>0){
                pos+=1;
            }
            else{
                zer+=1;
            }
        }
        System.out.println("Number of positive numbers = " + pos);
        System.out.println("Number of negative numbers = " + neg);
        System.out.println("Number of zeroes = " + zer);
        scan.close();
    }
}
