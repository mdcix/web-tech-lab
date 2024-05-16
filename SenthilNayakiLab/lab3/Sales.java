import java.util.Scanner;

public class Sales{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int salrange[] = new int[9];
        int n, sales, salary, range, index;

        System.out.print("Enter number of sales persons : ");
        n = scan.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("\nEnter sales of Person "+(i+1)+" : ");
            sales = scan.nextInt();
            salary = 200 + (int)(sales*0.09);
            System.out.println("Salary = "+salary);
            range = (int)(salary/100);
            if(range>=10){
                index = 8;
            }
            else{
                index = (range - 2);
            }
            salrange[index]+=1;
        }
        for(int i=0; i<8; i++){
            System.out.print((i+2)+"00 - "+(i+2)+"99 : ");
            System.out.println(salrange[i]);
        }
        System.out.print("1000 and abovee : ");
        System.out.println(salrange[8]);
        
        scan.close();
    }
}