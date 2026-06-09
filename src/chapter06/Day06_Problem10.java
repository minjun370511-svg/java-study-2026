package chapter06;

//계좌 잔액을 외부에서 직접 수정하지 못하도록 하시오.
class Account5 {
    String owner;
    private int balance;

    Account5(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int money) {
        balance += money;
    }

    int getBalance() {
        return balance;
    }
}

public class Day06_Problem10 {
    public static void main(String[] args) {
        Account5 account = new Account5("민준", 10000);
        account.deposit(5000);
        System.out.println(account.getBalance());
    }
}
