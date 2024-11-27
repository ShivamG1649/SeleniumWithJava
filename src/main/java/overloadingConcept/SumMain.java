package overloadingConcept;

public class SumMain {

    public static void main(String[] args) {

       // object creation we call the methods of a class

        Sum s = new Sum();
        s.add();  // Calling method1
        s.add(2 ,3);
        s.add("abc",20);

    }
}
