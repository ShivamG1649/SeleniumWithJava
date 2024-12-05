package basiscPrograming;

public class BankingMain {

    public static void main(String[] args) {

        BankingServices hdfcBank = new HDFCBank();
        BankingServices iciciBank=new ICICIBank();

        hdfcBank.setInterestRate(7.5);
        iciciBank.setInterestRate(6.5);

        hdfcBank.privateLoan(50000);
        iciciBank.privateLoan(300000);

        hdfcBank.showBankDetails();
        iciciBank.showBankDetails();

    }
}
