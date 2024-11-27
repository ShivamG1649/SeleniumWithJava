package overloadingConcept;

public class Sum {

    int a =10;
    int b = 20;

     void add()  // method 1

    {
        System.out.println(a+b);
    }

    public void add(int x , int y)  // method 2

    {
        System.out.println(x+y);
    }

    void add(String  name , int age)  // method 3

    {
        System.out.println(name + " is of age " +age);
    }

    void add(int age , String name)  // method 4

    {
        System.out.println(name + " is of age " +age);
    }

    void add(double x , double y)  // method 5

    {
        System.out.println(x+y);
    }
}
