import java.util.Random;
import java.lang.Math;
class Trigonometry{
    int a;
    int b;

    public void calculate(){
        System.out.println("Sin("+(a+b)+") = "+Math.sin(a+b));
        System.out.println("Cos("+(a+b)+") = "+Math.cos(a+b));
    }
}

public class Trig {
    public static void main(String args[]){
        Random rand = new Random();
        Trigonometry obj = new Trigonometry();
        obj.a = 1 + rand.nextInt(19);
        obj.b = 1 + rand.nextInt(19);
        System.out.println("Number 1 = "+obj.a);
        System.out.println("Number 2 = "+obj.b);
        System.out.println("sum = "+(obj.a+obj.b));
        obj.calculate();
    }
}
