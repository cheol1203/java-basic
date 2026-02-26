package oop1.ex;

public class Account {
    /*
    Account 클래스를 만들어라.
        int balance 잔액
        deposit(int amount): 입금 메서드
            입금시 잔액이 증가한다.
        withdraw(int amount): 출금 메서드
            출금시 잔액이 감소한다.
            만약 잔액이 부족하면 잔액 부족을 출력해야한다.
     */
    int balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if (amount <= balance){
            balance -= amount;
        } else{
            System.out.println("잔액 부족");
        }
    }
}
