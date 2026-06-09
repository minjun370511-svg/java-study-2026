package chapter06;

//은행 계좌 프로그램을 완성하시오.
class Account4 {
    String name;
    int balance;

    Account4(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    void deposit(int money) {
        balance += money;
    }

    void withdraw(int money) {
        if (balance >= money) {
            balance -= money;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    void printAccount() {
        System.out.println("예금주 : " + name);
        System.out.println("잔액 : " + balance);
    }
}

public class Day06_Problem09 {
    public static void main(String[] args) {
        Account4 account = new Account4("민준", 10000);
        account.deposit(5000);
        account.withdraw(3000);
        account.printAccount();
    }
}
