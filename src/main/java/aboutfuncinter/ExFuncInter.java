package aboutfuncinter;

import java.util.function.*;

public class ExFuncInter {
    public static void main(String[] args){
        //함수형 인터페이스는 추상 메소드를 딱 하나만 가지고 있는 인터페이스이다
        //@FunctionalInterface 애노테이션을 가지고 있다
        Function<Integer, Integer> plus100 = (i) -> i+100; //넣는 값 타입, 리턴값 타입
        System.out.println(plus100.apply(100)); //인자값에 +10을한다

        Function<Integer, Integer> multiply = (i) -> i*2;
        System.out.println(multiply.apply(2));

        Function<String, String> addA = (s) -> s+"A";
        System.out.println(addA.apply("A"));

        Function<Integer, Integer> multiply2plus100 = plus100.compose(multiply); //compose를 통해 2개를 합칠 수 있다
        System.out.println(multiply2plus100.apply(10)); //multiply가 먼저 실행되고 그다음에 100이 더해진다

        BiFunction<Integer, Integer ,Integer> plus10 = (i,j) -> i+j+10; //입력값을 2개 받는다
        System.out.println(plus10.apply(10,10));

        Consumer<Integer> printIn = (i) -> System.out.println(i); //리턴값이 없다
        printIn.accept(100);

        Supplier<String> getA = () -> "A"; //입력값이 없고, 값을 가져온다
        System.out.println(getA.get());

        Predicate<Integer> then10 = (i) -> i>10; //인자값을 받아서 true, false 리턴
        System.out.println(then10.test(100));
        Predicate<String> inTest = (s) -> s.contains("Test");
        System.out.println(inTest.test("Test set"));

        UnaryOperator<Integer> plus200 = (i) -> i+200; //입력값하고 동일한 타입을 리턴, Function을 상속 받는다
        System.out.println(plus200.apply(100));

        BinaryOperator<Integer> plus1000 = (i,j) -> i+j+1000; //입력값 2개하고 동일한 타입을 리턴
        System.out.println(plus1000.apply(1000,1000));

    }
}
