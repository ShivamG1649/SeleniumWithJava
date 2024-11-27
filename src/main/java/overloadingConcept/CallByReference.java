package overloadingConcept;

public class CallByReference {

    public static void main(String[] args) {

        Demo demo   =   new Demo();

        System.out.println("Value of age before method "+demo.age
        );

        demo.s2(demo);

        System.out.println("Value after call "+demo.age);
    }
}
