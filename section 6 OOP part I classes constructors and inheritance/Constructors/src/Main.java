public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(123_456_789,
                10_000,
                "Pierre Dramaix",
                "pierre.dramaix.java@gmail.com",
                604205276);

        BankAccount blankAccount = new BankAccount();

        System.out.println(blankAccount.getAccountNumber());
        System.out.println(blankAccount.getCustomerName());

        System.out.println("****************");

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getEmail());

        System.out.println("****************");

        System.out.println("Account number =" + bankAccount.getAccountNumber());
        System.out.println("Balance =" + bankAccount.getBalance());
        System.out.println("Customer name =" + bankAccount.getCustomerName());
        System.out.println("Email =" + bankAccount.getEmail());
        System.out.println("Phone number =" + bankAccount.getPhoneNumber());

        System.out.println("****************");

        bankAccount.despositFunds(15_000);
        bankAccount.withdrawFunds(50_000);

        System.out.println("****************");

        BankAccount bobAccount = new BankAccount("BOB", "email@email", 5555);
        System.out.println(bobAccount.getBalance());

        System.out.println("challenge start here");

        VipCustomer timAccount = new VipCustomer();

        System.out.println(timAccount.getCreditLimit() +
                timAccount.getEmailAddress() +
                timAccount.getName());

        VipCustomer pierreAccount = new VipCustomer("Pierre",0.0,"pierre@email.com");

        System.out.println(pierreAccount.getCreditLimit() +
                        pierreAccount.getEmailAddress() +
                        pierreAccount.getName());

        VipCustomer jesusAccount = new VipCustomer("jesus", 0.0);

        System.out.println(jesusAccount.getCreditLimit() +
                jesusAccount.getEmailAddress() +
                jesusAccount.getName());


    }
}
