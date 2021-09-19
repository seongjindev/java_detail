package abouthashmap;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
    public static void main(String[] args) {
        //선언
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.isEmpty()); //값이 있는지 확인
        System.out.println(map.size()); //맵의 크기 확인
        map.put(1, "1"); //데이터를 넣는다
        map.put(2, "3");
        map.put(3, "4");
        System.out.println(map.isEmpty()); //값이 있는지 확인
        System.out.println(map.size()); //맵의 크기 확인

        System.out.println(map.get(3)); //데이터 확인
        map.remove(3); //데이터 제거
        System.out.println(map.get(3)); //데이터가 없으면 null을 반환한다

        map.clear(); //전체 삭제
        System.out.println(map.size()); //크기 확인
    }
}
