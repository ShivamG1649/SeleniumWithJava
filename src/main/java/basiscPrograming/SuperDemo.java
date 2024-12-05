package basiscPrograming;

public class SuperDemo {

    // Create constructor of it

    String name ;
    int age;

    public SuperDemo(){

    }


    public void display(int a , int b){
        System.out.println("I am in display method");
    }
    public SuperDemo(int a ) {

        System.out.println("In constructor of superClass");
    }
}

class B extends SuperDemo{

    int age ;
    int name;

    public void display(){
        super.display(2,3 );
    }

    public static void main(String[] args) {

        B b = new B();


    }

}
