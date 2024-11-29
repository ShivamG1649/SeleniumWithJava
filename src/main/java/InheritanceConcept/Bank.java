package InheritanceConcept;

public class Bank
{
   String bankName;
   double interestRate;

   // Creation of constructor
    public Bank(){

    }

    public Bank(String bankName , double interestRate)
    {
       this.bankName=bankName;
       this.interestRate=interestRate;
    }


    // Method to display bank details

    public void displayDetails()
    {
        System.out.println("Bank Name "+ bankName);
        System.out.println("Interest Rate "+ interestRate+ "%");

    }



}
