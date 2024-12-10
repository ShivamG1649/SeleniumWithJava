package basiscPrograming;
/*
Exception is an event which cause program terminal
   1) Syntax issue compiler will us
   2) Logical
 */
public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Before exception ...");
        // Example 2
        String s =null;
        try {
            System.out.println(s.length());
        }
        catch (Exception e ){
            System.out.println("Exception handled");
        }

        try {
            int n = 10 / 0;  // we will not change it
        }

        catch (Exception e)
        {
            System.out.println("I am catch block");
        }



        System.out.println("After exception....   ");


    }
}
