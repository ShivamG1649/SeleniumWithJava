package basiscPrograming;

import java.util.Scanner;

public class PrimeNumberSita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num=scanner.nextInt();
        int noOfDividends=0;
        for (int i=1;i<=num;i++){
            if(num%i==0){
                noOfDividends++;
            }
        }if(noOfDividends>2){
            System.out.println("The given number is not a prime number");
        }else {
            System.out.println("The given number is a prime number");
        }
    }
}
