package chapter06;

import com.sun.security.jgss.GSSUtil;

//Setter를 이용한 숫자 데이터 검증
//Account6 클래스의 잔액(balance)을 수정할 때 음수가 저장되지 않도록 하시오.
class Account6 {
    private int balance;

    Account6(int balance) {
        this.balance = balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("잔액은 음수가 될 수 없습니다.");
        }
    }

    int getBalance() {
        return balance;
    }
}

public class Day06_Problem13 {
    public static void main(String[] args) {
        Account6 account = new Account6(10000);

        account.setBalance(-5000);

        System.out.println(account.getBalance());
    }
}
