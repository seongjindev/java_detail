package aboutdi;

interface Repository {

}

class MemoryRepository implements Repository{

}

class UserService {
    private final Repository repository = new MemoryRepository();
    //의존성이란 어떤 클래스가 다른 클래스의 기능이나 구성요소를 사용하는 것
    //Repository 인터페이스와 MemoryRepository 클래스에 의존하고 있다
    //DIP를 위반하고 있다(추상화에 의존해야지 구체화에 의존하면 안된다)

}
//의존성 주입
//class UserService {
//    private final Repository repository;
//
//    public UserService(Repository repository) {
//        this.repository = repository;
//    }
//    DIP를 해결할 수 있다
//}

public class ExDI {
}
