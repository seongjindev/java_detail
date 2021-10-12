package aboutthread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test_Y_01 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.print("R");
        }
    }
}
class Test_Y_02 extends Thread {
    public boolean work = true;
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (!work) {
                Thread.yield();
            }
            System.out.print("T");
        }
    }
}
public class ExThreadYield {
    public static void main(String[] args) {
        Test_Y_01 rb = new Test_Y_01();
        Thread test01 = new Thread(rb);
        Test_Y_02 test02 = new Test_Y_02();
        test02.start();
        test01.start();
        test02.work = false;
//        test02.work = true;
        System.out.print("메인종료");
    }
}

