package aboutthread;

class Sync_test implements Runnable {
    Account ac = new Account();
    @Override
    public void run() {
        while (ac.getBalance() > 0) {
            int money = (int)(Math.random() * 2 + 1) * 100;
            ac.wd(money);
            System.out.println("balance = " + ac.getBalance());
        }
    }
}

class Account {
    public int getBalance() {
        return balance;
    }

    private int balance = 500;

    public void wd(int money) { //public synchronized void wd(int money) {
//        if (balance >= money) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            balance -= money;
//        }
        synchronized (this) {
            if (balance >= money) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance -= money;
            }
        }
    }
}

public class ExThreadSync {
    public static void main(String[] args) {
        Runnable test1 = new Sync_test();
        Thread th1 = new Thread(test1);
        Thread th2 = new Thread(test1);
        th1.start();
        th2.start();
    }
}
