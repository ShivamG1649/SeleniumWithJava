package overloadingConcept;

public class Demo {
// Class members means the variable inside the class and it's methods
       int age;

//    void s1(int age)
//
//    {
//        age = age +10;
//        System.out.println("Value in the method"+age);
//
//    }

    void s2(Demo d1)//reference creation of a class
    {

        d1.age =d1.age+10;

        System.out.println("Value in method " + d1.age);
    }
}
