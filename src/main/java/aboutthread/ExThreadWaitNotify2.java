package aboutthread;

import java.util.ArrayList;

class BurgerShop {
    String[] burger = {"burger1", "burger2", "burger3"};
    private ArrayList<String> burgerList = new ArrayList<>();

    public synchronized void add(String burger) {
        if (burgerList.size() >= 5) {
            notify();
            return;
        }
        burgerList.add(burger);
        System.out.println("Burger: " + burgerList.toString());
    }

    public boolean remove(String dishName) {
        synchronized (this) {
            while(burgerList.size()==0) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting");
                try {
                    wait();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < burgerList.size(); i++) {
                if(dishName.equals(burgerList.get(i))) {
                    burgerList.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public int burgerNum() {
        return burger.length;
    }
}

class Cust implements Runnable {
    private BurgerShop burgerShop;
    private String burger;

    public Cust(BurgerShop burgerShop, String burger) {
        this.burgerShop = burgerShop;
        this.burger = burger;
    }

    public void run() {
        while(true) {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            if (eatFood()) {
                System.out.println(name + " ate a" + burger);
            } else {
                System.out.println(name + " failed to eat.");
            }
        }
    }

    boolean eatFood() {
        return burgerShop.remove(burger);
    }
}

class BurgerCook implements Runnable {
    private BurgerShop burgerShop;

    public BurgerCook(BurgerShop burgerShop) {
        this.burgerShop = burgerShop;
    }

    public void run() {
        while(true) {
            int idx = (int)(Math.random()*burgerShop.burgerNum());
            burgerShop.add(burgerShop.burger[idx]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExThreadWaitNotify2 {
    public static void main(String[] args) throws InterruptedException {
        BurgerShop burgerShop = new BurgerShop();

        new Thread(new BurgerCook(burgerShop), "BurgerCook").start();
        new Thread(new Cust(burgerShop, "burger1"), "CUST1").start();
        new Thread(new Cust(burgerShop, "burger2"), "CUST2").start();

        Thread.sleep(5000);
        System.exit(0);
    }
}
