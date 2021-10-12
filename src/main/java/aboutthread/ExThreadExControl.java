package aboutthread;

class Test_01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("1");
        }
        System.out.println("Runnable 종료");
    }
}
class Test_02 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print("2");
        }
        System.out.println("Thread 종료");
    }
}
public class ExThreadExControl {
    public static void main(String[] args) {
        Test_01 rb = new Test_01();
        Thread test01 = new Thread(rb);
        Test_02 test02 = new Test_02();
        test01.start();
        test02.start();
        try {
            Thread.sleep(3000); //메인에만 영향을 미친다
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("메인종료");
    }
}
