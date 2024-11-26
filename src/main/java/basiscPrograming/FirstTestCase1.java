package basiscPrograming;

public class FirstTestCase1 {

    public static void main(String[] args) {


//// a+ b
//        int age = 30 ;
//        //  (Condition) ?  "Statement execute if condition true :Statement execute if condition false
//        String Status = (age>=18)?"Adultrafer":"Minor";
//
//        System.out.println(Status);


        // AND , OR
        // 10001 AND 10001


    int[][] myArray = new int[2][3];
    /*

       10 , 12 , 3
       1 , 2,  4

     */

        myArray[0][0]=10;
        myArray[0][1]=12;
        myArray[0][2]=18;

        myArray[1][0]=10;
        myArray[1][1]=12;
        myArray[1][2]=18;


        // this is known as the array of the array

//        int[][] myArray2 = {
//                {1,2,3},{1,2,3}
//
//        };

        //first row , col

        /*

        *
        * *
        * * *

         */

        for( int i= 0;i<myArray.length;i++){

            for(int j=0;j<myArray[i].length;j++){
                System.out.print(myArray[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
