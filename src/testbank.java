public class testbank {
    public static void main(String[] args) {
        Bank mybank = new Bank(8080,"tom",600);
        System.out.println(mybank.AccountName);
        System.out.println(mybank.AccountNumber);
        System.out.println(mybank.AccountBalance);

        mybank.deposit(8000);
        System.out.println("You now have: "+mybank.AccountBalance);

        mybank.withdraw(5600);
        System.out.println("You now have: "+mybank.AccountBalance);

}
}

