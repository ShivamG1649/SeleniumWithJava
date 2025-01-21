package accessModifierDemo;

public class C {

    public static void main(String[] args) {
        B objb = new B();

        objb.b=10;// b is private
        objb.displayB();
        objb.ageB=10;
    }
}
