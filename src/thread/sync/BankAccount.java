package thread.sync;

public interface BankAccount {

    // 출금
    boolean withdraw(int amount);

    // 잔고 확인
    int getBalance();
}
