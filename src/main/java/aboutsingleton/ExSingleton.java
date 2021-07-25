package aboutsingleton;

public class ExSingleton {
    //인스턴스가 1개만 생성되는 것을 보장하는 디자인 패턴이다
    //private를 사용하여 new 키워드를 사용하지 못하도록 해야한다
    //싱글톤 구현은 여러가지 방법이 있다
    //단점
    //기존보다 구현하는 코드가 더 길어진다
    //구체 클래스에 의존하므로 DIP를 위반한다
    //구체 클래스에 의존하므로 OCP를 위반할 가능성이 있다
    //테스트하기 어렵다
    //내부속성을 변경하거나 초기화하기 어렵다
    //private 생성자로 자식 클래스 만들기가 어렵다
    //유연성이 떨어진다
    //안티패턴 중 하나
    public static void main(String[] args){
        SingletonTest1 singletonTest1 = new SingletonTest1();
        SingletonTest1 singletonTest2 = new SingletonTest1();

        System.out.println("singletonTest1 = " + singletonTest1);
        System.out.println("singletonTest2 = " + singletonTest2); //참조값이 다르다 jvm 메모리에 계속 올라감

        SingletonTest2 singletonTest21 = SingletonTest2.getInstance();
        SingletonTest2 singletonTest22 = SingletonTest2.getInstance();

        System.out.println("singletonTest21 = " + singletonTest21);
        System.out.println("singletonTest22 = " + singletonTest22); //참조값이 같다


    }
}
