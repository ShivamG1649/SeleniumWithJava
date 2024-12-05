package basiscPrograming;


class Counter{

    static  String connectionURL;
   static int count =1;




    // create one constructor

    Counter(){

    }

    // Static method to display the value of static varaiable
    static void displayCount(){

        System.out.println("current count " +count);
    }
}



public class StaticKeyWordDemo {

    // The static keyword in java used to define class -level and methods

    // if a variable is static then it can be shared by all the object of that class

    public static void main(String[] args) {


        Counter obj1 = new Counter();//1
        Counter.displayCount();
        Counter obj2 = new Counter();//2


// Static methods and variables can be accessed by className only

    }



}
