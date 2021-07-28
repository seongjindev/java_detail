package aboutequals;

public class Exequals {
    //동일성과 동등성
    //동일하다는 두 개의 오브젝트가 완전히 같은 경우를 의미
    //동일하다는 == 연산자로 표시
    //동등하다는 두 개의 오브젝트가 같은 정보를 같고 있을 경우를 의미
    //동등하다는 equals 연산자로 표시
    public static void main(String[] args) {
        String a = new String("aaa");
        String b = new String("aaa");

        System.out.println(a==b); //주소값이 다르기 때문에 false
        System.out.println(a.equals(b)); //값이 같기 때문에 true

        String c = "aaa";
        String d = "aaa";
        System.out.println(c==d); //리터럴 방식("")으로 String 객체를 생성하면 ==비교했을 때 true가 반환된다
        //리터럴 방식으로 String 객체를 생성하면 constant pool 영역에 생성된다
        //이때 JVM은 객체의 heap 영역이 아니라, constant pool 영역으로 찾아간다.
        //그리고 constant pool 영역에 이전과 같은 값을 가지고 있는 String 객체가 있다면,
        //그 객체의 주소값을 반환하여 참조하도록 한다.
        //출처 : https://velog.io/@jsj3282/%EB%8F%99%EB%93%B1%EC%84%B1%EA%B3%BC-%EB%8F%99%EC%9D%BC%EC%84%B1

        //hashcode에 대해서도 추가 필요

    }
}
