package aboutstatic;

class StaticTest {
    String name = "name1"; //멤버변수 - 인스턴스 변수
    static String staticName; //멤버변수 - 클래스 변수

    public void printNum(int num) { //인스턴스 메서드
        System.out.println(num);
    }

    public static void printNum2(int num) { // 클래스 메서드(static 메서드)
        System.out.println(num);
    }

    static { // 초기화 블럭
        staticName = "staticName!";
    }
}

public class ExStatic {
    public static void main(String[] args) {
        System.out.println(StaticTest.staticName); //객체를 생성하지 않아도 사용할 수 있다
        StaticTest.printNum2(11); //객체를 생성하지 않아도 사용할 수 있다

        StaticTest a = new StaticTest();
        System.out.println(a.name); //객체를 생성해야 사용할 수 있다
        a.printNum(10); //객체를 생성해야 사용할 수 있다
    }
}
