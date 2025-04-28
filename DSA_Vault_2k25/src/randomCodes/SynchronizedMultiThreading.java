package DSA_Vault_2k25.src.randomCodes;

class BankAccount {
    private int balance = 10000;
    private int balance2=10000;

    // As this method is not thread safe, so each thread access the method at same time and Race condition happens: Bank account goes negative, which should never happen.
    public void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw $" + amount);
            try { Thread.sleep(100); } catch (InterruptedException e) { }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: $" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw $" + amount + ". Insufficient balance!");
        }
    }

    public synchronized void withdrawThreadSafe(int amount) {
        if (balance2 >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw $" + amount);
            try { Thread.sleep(100); } catch (InterruptedException e) { }
            balance2 -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: $" + balance2);
        } else {
            System.out.println(Thread.currentThread().getName() + " cannot withdraw $" + amount + ". Insufficient balance!");
        }
    }
}


public class SynchronizedMultiThreading {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Runnable task = () -> account.withdraw(6000);

        Thread t1 = new Thread(task, "Person 1: ATM-1");
        Thread t2 = new Thread(task, "Person 2: ATM-2");

        t1.start();
        t2.start();

        Thread.sleep(5000);
        System.out.println("Moving to Synchronised ATMs");

        Runnable task2 =()-> account.withdrawThreadSafe(6000);
        Thread t3 = new Thread(task2, "Person 3: ATM-1");
        Thread t4 = new Thread(task2, "Person 4: ATM-2");

        t3.start();
        t4.start();

    }
}

