package basiscPrograming;
import java.util.Scanner;

public class PrimeNumberNamrata {


    public static void main(String[] args) {
        Scanner inputInt= new Scanner(System.in);
        int userInpt=inputInt.nextInt();

        System.out.println(userInpt);
        PrimeNumberNamrata primeNum=new PrimeNumberNamrata();
        primeNum.calculatePrimeNum(userInpt);

    }
    public void calculatePrimeNum(int num){
        int count=0;
        for (int i=num-1; i>0; i--) {
            System.out.println("Printing i===="+i);
            if ((num%i) ==0) {
                System.out.println(num/i);
                count +=1;
            }
            System.out.println(count+"I am count");
        }
        if (count < 2) {
            System.out.println("I am a prime number::::" + num);
        }

    }

//    public PrimeNumberNamrata(){
//        calculatePrimeNum(2);
//    }

}
