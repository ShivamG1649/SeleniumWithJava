package accessModifierDemo;

public class B {

      int b ;
      int ageB;

     void displayB(){

        System.out.println("I am in displayB method");
    }

    public static void main(String[] args) {
        B b1 = new B();
        b1.b=10;
    }

    // to find the difference between default and protected access modifier with example
}
