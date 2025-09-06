public class Bank {
    int AccountNumber;
    String AccountName;
    double AccountBalance;


    public Bank(int AccountNumber, String AccountName, double AccountBalance){
    this.AccountNumber = AccountNumber;
    this.AccountBalance = AccountBalance;
    this.AccountName = AccountName;
    }
    public void deposit(double m){
        if (m >0 ){
            System.out.println(m + AccountBalance);
            AccountBalance += m;
        }else {
            System.out.println("Please enter a positive number");
        }
    }
    public void withdraw(double m){
        if (m > 0){
            System.out.println(AccountBalance - m);
            AccountBalance -= m;
        }
        else {
            System.out.println("Please enter a positive number");
        }
    }

}