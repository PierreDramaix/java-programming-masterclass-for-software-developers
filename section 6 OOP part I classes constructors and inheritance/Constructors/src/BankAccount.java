public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

   /* getter and setter ON*/

    public void setAccountNumber(int number){
       this.accountNumber = number;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(int number){
        this.balance = number;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setCustomerName(String name){
        this.customerName = name;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void setEmail(String name){
        this.email = name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setPhoneNumber(int number){
        this.phoneNumber = number;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    /*getter and setter DONE*/

    public void despositFunds(int funds){
        this.balance += funds;
        System.out.println("new balance: " + this.balance);
    }
    public void withdrawFunds(int funds){

        if((this.balance - funds) < 0){
            System.out.println("You broke!");
        } else {
            this.balance -= funds;
            System.out.println("new balance: " + balance);
        }
    }

    
}
