package chapter06;

//은행 계좌를 나타내는 Account 클래스를 작성하시오.
class Account {
    String owner;
    int balance;

    Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int money) {
        balance += money;
    }
}

public class Day06_Problem06 {
    public static void main(String[] args) {
        Account account = new Account("민준", 10000);
        account.deposit(5000);
        System.out.println(account.balance);
    }
}
