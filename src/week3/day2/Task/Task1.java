package week3.day2.Task;

public class Task1 {

   public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1,"Иван", 8);
        acc1.putMoney(46);
        acc1.showBalance();
        acc1.putMoney(100);
        acc1.showBalance();
        acc1.takeMoney(125.8);
        acc1.showBalance();

    }

}
class BankAccount {
    int accountNumber;
    String accountOwner;
    double balance;


    BankAccount(int accountNumber, String accountOwner, double balance) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.balance = balance;

    }

    public void putMoney(double num) {
        balance += num;
    }
    public void takeMoney(double num) {
        balance -= num;
    }

    public void showBalance() {
        System.out.printf("Баланс счета: %.1f", balance);
        System.out.println();
    }
}