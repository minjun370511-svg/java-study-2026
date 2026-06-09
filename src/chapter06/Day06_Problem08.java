package chapter06;

//계좌 정보를 출력하는 메서드를 작성하시오.
class Account3 {
    String name;
    int balance;

    Account3(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    void printAccount() {
        System.out.println("예금주 : " + name);
        System.out.println("잔액 : " + balance);
    }
}

public class Day06_Problem08 {
    public static void main(String[] args) {
        Account3 account = new Account3("민준", 10000);
        account.printAccount();
    }
}
