package aboutthread;

class Test_join_01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.print("R");
        }
        System.out.println("Runnable 종료");
    }
}
class Test_join_02 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.print("T");
        }
        System.out.println("Thread 종료");
    }
}

public class ExThreadJoin {
    public static void main(String[] args) {
        Test_join_01 rb = new Test_join_01();
        Thread test1 = new Thread(rb);
        Test_join_02 test2 = new Test_join_02();
        test1.start();
        test2.start();
        try { //메인쓰레드가 test1과 test2의 작업이 끝날 때까지 기다림
            test1.join();
            test2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("메인종료");
    }
}
