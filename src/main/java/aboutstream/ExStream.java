package aboutstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExStream {
    //연속된 데이터를 처리
    //데이터를 담고 있는 저장소(컬렉션)이 아니다
    //종료 오퍼레이션이 필요하다
    public static void main(String[] args){
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("10");
        numbers.add("100");
        numbers.add("2");
        numbers.add("2000");

        //1로 시작하는 숫자
        numbers.stream()
                .filter(s -> s.startsWith("1")) //중개 오퍼레이션 - Stream을 리턴
                .forEach(s -> System.out.println(s)); //종료 오퍼레이션 - Stream을 리턴하지 않는다
        System.out.println("----------");

        //2로 시작하는 숫자를 리스트
        List<String> collect = numbers.stream()
                .filter(s -> s.startsWith("2"))
                .collect(Collectors.toList());
        collect.stream().forEach(s -> System.out.println(s));
        System.out.println("----------");

        //11부터 20까지 출력
        Stream.iterate(1, i -> i+1)
                .skip(10)
                .limit(10)
                .forEach(i -> System.out.println(i));
        System.out.println("----------");

        //0이 포함되어 있는지 확인
        boolean b = numbers.stream()
                .anyMatch(s -> s.contains("0"));
        System.out.println(b);
        System.out.println("----------");

        //0이 포함되어 있는 값의 갯수
        long count = numbers.stream()
                .filter(s -> s.contains("0"))
                .count();
        System.out.println(count);
        System.out.println("----------");

        //숫자형으로 변경 후 합계
        int asInt = numbers.stream()
                .mapToInt(i -> Integer.parseInt(i))
                .reduce((left, right) -> left + right)
                .getAsInt();
        System.out.println(asInt);
        System.out.println("----------");

        //숫자형으로 변경 후 리스트
        int asInt1 = numbers.stream()
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();
        System.out.println(asInt1);
        System.out.println("----------");

        //병렬 처리 - 데이터가 많은 경우 유리
        List<String> collect2 = numbers.stream()
                .map((s) -> {
                    System.out.println(s + " " + Thread.currentThread().getName());
                    return s.concat("0");
                }).collect(Collectors.toList());
        System.out.println("----------");
        List<String> collect3 = numbers.parallelStream()
                .map((s) -> {
                    System.out.println(s + " " + Thread.currentThread().getName());
                    return s.concat("0");
                }).collect(Collectors.toList());


    }
}
