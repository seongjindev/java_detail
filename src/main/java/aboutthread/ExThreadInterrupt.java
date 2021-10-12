package aboutthread;

import java.util.Scanner;

class Test_In_01 extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (!isInterrupted()) {
            System.out.println(i++);
            for (long j = 0; j < 2000000000L; j++);
        }
        System.out.println("쓰레드 종료");
    }
}

public class ExThreadInterrupt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Test_In_01 test01 = new Test_In_01();
        test01.start();

        System.out.println("값 입력");
        int a = sc.nextInt();
        System.out.println("입력 값 = " + a);
        test01.interrupt();
        System.out.println("메인 종료");
    }
}
