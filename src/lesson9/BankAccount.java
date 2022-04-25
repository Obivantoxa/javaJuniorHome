package lesson9;

public class BankAccount {

    private long id;
    private String name;
    private long balance;

    public BankAccount() {

    }

    public BankAccount(long id, String name, long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

//    @Override
//    public String toString() {
//        return "BankAccount{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", balance=" + balance +
//                '}';
    //}
}

class TestBankAccount {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        BankAccount yourBankAccount = new BankAccount();
        BankAccount hisBankAccount = new BankAccount();

       myBankAccount.setBalance(24);
       myBankAccount.setId(1);
       myBankAccount.setName("Зеленый аккаунт");
        System.out.println(myBankAccount);

        yourBankAccount = myBankAccount;

        System.out.println(yourBankAccount);


    }

}
