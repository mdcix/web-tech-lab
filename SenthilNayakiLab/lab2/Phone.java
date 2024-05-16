import java.util.Random;

class Generate{
    String number;
    public String getNumber(){
        int temp;
        Random rand = new Random();
        temp = 1 + rand.nextInt(7);
        for (int i=0; i<2; i++){
            temp*=10;
            temp += rand.nextInt(8);
        }
        number = Integer.toString(temp) + "-";

        temp = 100 + rand.nextInt(555);

        number += Integer.toString(temp) + "-";

        temp = 1000 + rand.nextInt(8999);
        number += Integer.toString(temp);

        return number;
    }
}


public class Phone {
    public static void main(String args[]){
        Generate num = new Generate();
        String phnum = num.getNumber();
        System.out.println(phnum);
    }
}
