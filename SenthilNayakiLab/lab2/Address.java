import java.util.Scanner;
import java.util.Random;

class Location{
    String city;
    String country;
    int pincode;
}

public class Address{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        Location obj = new Location();
        System.out.print("Enter city : ");
        obj.city = scan.nextLine();
        System.out.print("Enter country : ");
        obj.country = scan.nextLine();
        obj.pincode = 10 + rand.nextInt(90);
        System.out.println(obj.country.substring(0, 2) + "," + obj.city + obj.pincode);
        scan.close();
    }
}