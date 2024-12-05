package basiscPrograming;

//private

// public

// child class is responsible to provide the define all the abstract method of parent class

abstract class Bike {


    // if the class is an abstract class , then there should be at least one abstract method inside this class

    abstract  void run();

    abstract void break1();




    public void headLight()
    {
        System.out.println("By default headlight should on");
    }


}

class Honda extends Bike{


    @Override
    void run() {

    }

    @Override
    void break1() {
        System.out.println("Honda has drum break system");
    }


    public static void main(String[] args) {
        Bike obj = new Honda();
        // creating object of Honda class, parent class reference can contain object of child class
//        obj.break1();
//        obj.run();

        Honda obj1 = new Honda();
        obj1.headLight();

         //  new Bike(); this is not allowed for abstract classes , we can not create an object for abstract classes



    }


}






