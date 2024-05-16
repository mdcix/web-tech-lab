import java.util.Random;

public class RandomExample {
    public static void main(String args[]){
        Random rand = new Random();
        int rollsum[] = new int[12];
        int res, first, second;
        
        for (int i = 0; i<36000000; i++){
            first = 1+rand.nextInt(6);
            second = 1+rand.nextInt(6);
            res = first+second;
            rollsum[res-1]+=1;
        }
        System.out.println("SUM\t\tCOUNT");
        for(int i=1; i<12; i++){
            System.out.println((i+1)+"\t\t"+rollsum[i]);
        }
    }
}
