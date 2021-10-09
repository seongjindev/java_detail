package aboutthread;

import java.util.Scanner;

class ThreadTest1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10000000; i++) {
//            System.out.println(getName() + " " + i);
        }
    }
}
class ThreadTest2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10000000; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class ThreadTest3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExThread {
    public static void main(String[] args) {
        ThreadTest1 threadTest1 = new ThreadTest1();
        ThreadTest2 r = new ThreadTest2();
        Thread threadTest2 = new Thread(r);

        long start = System.currentTimeMillis();
        threadTest1.start();
        threadTest2.start();
        System.out.println("멀티쓰레드 결과 = " + (System.currentTimeMillis() - start));

        long start2 = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
        }
        for (int i = 1; i <= 10000000; i++) {
        }
        System.out.println("싱글 결과 = " + (System.currentTimeMillis() - start2));
    }
}
//        //IO blocking
//        Scanner sc = new Scanner(System.in);
//        System.out.println("값 입력");
//        String input = sc.next();
//        System.out.println("입력갑은 = " + input);
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(500);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        ThreadTest3 r2 = new ThreadTest3();
//        Thread threadTest3 = new Thread(r2);
//        threadTest3.start();
//        System.out.println("값 입력");
//        String input2 = sc.next();
//        System.out.println("입력갑은 = " + input2);
//
//    }
//}
