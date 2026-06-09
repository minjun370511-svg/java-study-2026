package chapter06;

//은행 계좌에서 출금하는 기능을 추가하시오.
class Account2 {
    String owner;
    int balance;

    Account2(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void withdraw(int money) {
        if (balance >= money) {
            balance -= money;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}

public class Day06_Problem07 {
    public static void main(String[] args) {
        Account2 account = new Account2("민준", 10000);
        account.withdraw(15000);
    }
}
