package basiscPrograming;


// Constants / method signature , default methods
interface BankingServices {


    void privateLoan(double amount);


    void setInterestRate(double rate);


    default void showBankDetails()
    {
        System.out.println("This is a bank providing banking services");
    }

}

class HDFCBank implements BankingServices

{


    @Override
    public void privateLoan(double amount) {
        System.out.println("HDFC Bank : Processing a personal loan of amount "+amount);
    }

    @Override
    public void setInterestRate(double rate) {
        System.out.println("HDFC Bank : Rate of interest is "+rate +"%");
    }

    class ICICIBank implements BankingServices{

        @Override
        public void privateLoan(double amount) {

        }

        @Override
        public void setInterestRate(double rate) {

        }

        @Override
        public void showBankDetails(){
            System.out.println("This is HDFC Bank , we offer personal and Business loans");
        }
    }
}



class ICICIBank implements BankingServices{

    @Override
    public void privateLoan(double amount) {

    }

    @Override
    public void setInterestRate(double rate) {

    }

    @Override
    public void showBankDetails(){
        System.out.println("This is ICICI Bank , we offer personal and home loans");
    }
}













