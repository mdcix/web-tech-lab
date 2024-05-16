import java.util.Scanner;
public class BMI {
    public static void main(String args[]){
        float weight, height, bmi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in kg : ");
        weight = scan.nextFloat();
        System.out.print("Enter height in m : ");
        height = scan.nextFloat();
        bmi = weight/(height*height);
        System.out.println("Your BMI = "+bmi);
        if(bmi<16){
            System.out.println("You are Severe thin");
        }
        else if(bmi<18.5){
            System.out.println("You are thin");
        }
        else if(bmi<25){
            System.out.println("You are normal");
        }
        else if(bmi<30){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("You are obese");
        }
        scan.close();
    }
}
