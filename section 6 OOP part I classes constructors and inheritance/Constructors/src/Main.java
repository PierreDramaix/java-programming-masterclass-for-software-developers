public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(123_456_789);
        bankAccount.setBalance(10_000);
        bankAccount.setCustomerName("Pierre Dramaix");
        bankAccount.setEmail("pierre.dramaix.java@gmail.com");
        bankAccount.setPhoneNumber(604205276);

        System.out.println("Account number =" + bankAccount.getAccountNumber());
        System.out.println("Balance =" + bankAccount.getBalance());
        System.out.println("Customer name =" + bankAccount.getCustomerName());
        System.out.println("Email =" + bankAccount.getEmail());
        System.out.println("Phone number =" + bankAccount.getPhoneNumber());

        bankAccount.despositFunds(15_000);
        bankAccount.withdrawFunds(50_000);

    }
}
