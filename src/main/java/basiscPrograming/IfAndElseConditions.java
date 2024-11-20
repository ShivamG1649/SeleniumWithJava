package basiscPrograming;

public class IfAndElseConditions {

    //

    public static void main(String[] args) {

        // Print 1 to 10
//
//        for( int i = 1 ; i<10 ; i++){
//
//            if( i%2==0){
//                System.out.println(i);
//            }
//
//
//
//        }


        int age = 61;

        // Nested if -else to check age group

        if( age >=18){

            if(age <60){
                System.out.println("you are an adult");
            }
            else {
                System.out.println("you are a senior");
            }

        }
        else {
            System.out.println("you are a minor");
        }





    }


}
