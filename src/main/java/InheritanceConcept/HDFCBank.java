package InheritanceConcept;

public class HDFCBank extends Bank {

    // HDFC is a Bank
    // RBI is a Bank

    String branchLocation;

    public HDFCBank(){

    }
    public HDFCBank(String bankName , double interestRate, String branchLocation)
    {


    }

    // Overriding  Concept

    @Override
    public void displayDetails()
    {
        //super will be used with inheritance concept
        // super -> parent class , child parent relationship
        super.displayDetails();
        System.out.println("Branch location "+branchLocation);
    }

    public static void main(String[] args) {
        HDFCBank hdfc = new HDFCBank("HDFC Bank",5.0,"Mumbai");
        hdfc.displayDetails();

    }


}
