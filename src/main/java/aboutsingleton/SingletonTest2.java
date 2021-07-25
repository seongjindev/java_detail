package aboutsingleton;

public class SingletonTest2 {
    private static final SingletonTest2 instance = new SingletonTest2(); //한개만 존재하게 된다

    public static SingletonTest2 getInstance(){
        return instance;
    }

    private SingletonTest2(){ //private 생성자를 사용해서 외부에서 임의로 new 키워드를 사용하지 못하도록 막아야 한다
    }

    public void Test(){
        System.out.println("테스트 메서드");
    }
}
