class ExceptionA extends Exception{
    ExceptionA(String msg){
        super(msg);
    }
}
class ExceptionB extends ExceptionA{
    ExceptionB(String msg){
        super(msg);
    }
}
class ExceptionC extends ExceptionB{
    ExceptionC(String msg){
        super(msg);
    }
}

public class Qn1 {
    public static void main(String args[]){
        try{
            throw new ExceptionA("Execption type A"); 
        }
        catch(ExceptionA e){
            e.printStackTrace();
            System.out.println("Catched by ExceptionA");
        }
        try{
            throw new ExceptionB("Execption type B"); 
        }
        catch(ExceptionA e){
            e.printStackTrace();
            System.out.println("Catched by ExceptionA");
        }
        try{
            throw new ExceptionC("Execption type C"); 
        }
        catch(ExceptionA e){
            e.printStackTrace();
            System.out.println("Catched by ExceptionA");
        }
    }
}
