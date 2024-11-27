package overloadingConcept;

public class OverloadingMainMethod {

    void main(int a ){

        System.out.println(a);
    }

    void main(double a ){

        System.out.println(a);
    }

    void main(int a , String str ){

        System.out.println(a);
    }

    void main(String str  , int a ){

        System.out.println(a);
    }

    public static void main(String[] args)
    {

        OverloadingMainMethod obj = new OverloadingMainMethod();
        obj.main(10);

    }


}
