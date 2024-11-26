package oopsConcetps;

public class Animal {


    /// dog is an object of a class


    // State and it's behavior

    // State of an object
    // Class level variable
    int num_of_legs;
    String color;
    String colorOfEyes;

//    public Animal() {
//
//    }

    // behaviour will be defined with teh help of methods
    // access modifiers are  public / private / protected / default
    // Return types int/ String / void ( nothing )
    // Name of the method


    // define a method

    // If name of method is same as class



    public void displayColor(){

        System.out.println("color of animal is "+this.color);

    }


//    public Animal(int a, int b,int c){
//        System.out.println("Constructor with 3 parameters");
//    }
////
//    public Animal(int a, int b){
//
//        System.out.println("Constructor with 2 parameters");
//    }

    public static void main(String[] args) {

        //Object of a class , new keyword

        // nameofClass nameOfAnObject = new ClassName();

        // Just after creation of a new object constructor will call automatically

       Animal cat =new Animal();
       cat.num_of_legs=4;


//        dog1.num_of_legs=4;
//        dog1.color="white";
//        dog1.displayColor();  // Calling a method

//        Animal dog2 = new Animal();
//        dog2.num_of_legs=4;
//        dog2.color="black";
//        dog2.displayColor();


    }


    // Create a Bank class
    // int rateOfInterest, NameOfBank , BankCityName , accountType
    // Methods would be calculation of RateOfInterest , LoanCalculation


    // it's objects , HDFC Bank , Icici Bank , yesBank



}
