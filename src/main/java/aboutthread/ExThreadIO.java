package aboutthread;

import java.util.Scanner;

class ThreadIOTest1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("Thread = " + i);
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadIOTest2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("Runnable = " + i);
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class ExThreadIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("값입력 : ");
        String in = sc.next();
        System.out.println("입력값은 " + in);

        ThreadIOTest1 test1 = new ThreadIOTest1();
        ThreadIOTest2 rb = new ThreadIOTest2();
        Thread test2 = new Thread(rb);

        test1.start();
        test2.start();
        test2.setPriority(9); //우선순위 설정
        System.out.println("값입력 : ");
        String in2 = sc.next();
        System.out.println("입력값은 " + in2);
        sc.close();
    }
}
