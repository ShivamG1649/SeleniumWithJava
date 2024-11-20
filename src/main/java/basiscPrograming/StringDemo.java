package basiscPrograming;

public class StringDemo {


    public static void main(String[] args) {

  /*

    In Java, the String class is part of the java.lang package,
     and it is used to represent a sequence of characters.
     Since strings are widely used in programming for manipulating text,
    Java provides a rich set of methods for working with strings
   */

//        String str = new String("Hello");
//        System.out.println(str);

        char[] chars ={'H','s','l','l','o',' ','m'};
        String st1 = new String(chars);
        System.out.println(st1);

        // Length this is used to find out the the lenght of string
         int length = st1.length();
        System.out.println(length);

         String replace = st1.replace('H','M');
        System.out.println("Replace String " +replace);
     // Hello to HELLO

        String st2 =st1.toUpperCase();
        System.out.println("Upper char " +st2);

    }
}
