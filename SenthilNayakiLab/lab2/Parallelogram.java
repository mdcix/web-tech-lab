import java.util.Random;
class ParCalculate{
    int a;
    int b;
    int h;

    public void calculate(){
        System.out.println("Area = "+(b*h));
        System.out.println("Perimeter = "+(2*(a+b)));
    }
}

public class Parallelogram {
    public static void main(String args[]){
        Random rand = new Random();
        ParCalculate obj = new ParCalculate();
        obj.a = 10 + rand.nextInt(20);
        obj.b = 10 + rand.nextInt(20);
        obj.h = 10 + rand.nextInt(20);
        System.out.println("Side 1 = "+obj.a);
        System.out.println("Side 2(base) = "+obj.b);
        System.out.println("Height = "+obj.h);
        obj.calculate();
    }
}
