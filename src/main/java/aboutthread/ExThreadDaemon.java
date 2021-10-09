package aboutthread;

//public class ExThreadDaemon implements Runnable{
//    static boolean start = false;
//    public static void main(String[] args) {
//        Thread renew = new Thread(new ExThreadDaemon());
//        Thread renew2 = new Thread(new ExThreadDaemon());
//        renew.setDaemon(true);
//        renew2.setDaemon(true);
//        renew.start();
//        renew2.start();
//
//        for (int i = 0; i <= 15; i++) {
//            start = true;
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println(i);
//            System.out.println(renew.getName());
//            System.out.println(renew2.getName());
//            System.out.println(Thread.currentThread());
//        }
//        System.out.println("종료");
//    }
//
//    @Override
//    public void run() {
//        while(true) {
//            try {
//                Thread.sleep(5000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            if (start) {
//                System.out.println("자동저장");
//            }
//        }
//    }
//}

class ThreadDaemonTest implements Runnable {
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("자동저장");
        }
    }
}

public class ExThreadDaemon {
    public static void main(String[] args) {
        Thread renew = new Thread(new ThreadDaemonTest());
        renew.setDaemon(true);
        renew.start();

        for (int i = 0; i <= 15; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i);
            System.out.println(renew.getName());
            System.out.println(Thread.currentThread());
        }
        System.out.println("종료");
    }
}
