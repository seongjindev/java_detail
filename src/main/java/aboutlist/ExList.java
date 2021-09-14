package aboutlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        //추가
        arrayList.add(1);
        arrayList.add(0, 20);
        //변경
        arrayList.set(0, 10);
        //값 확인
        Integer rst1 = arrayList.get(0);
        System.out.println(rst1);
        //제거
        arrayList.remove(0);
        //전체 제거
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.clear();

        //----//

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        //전체 값 확인
        arrayList.forEach(System.out::println);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i);
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        //추가
        linkedList.add(1);
        linkedList.addFirst(1);
        linkedList.addLast(1);
        linkedList.add(0, 10);
        //변경
        linkedList.set(0, 10);
        //값 확인
        Integer rst2 = linkedList.get(0);
        System.out.println(rst2);
        //제거
        linkedList.remove(0);
        linkedList.removeFirst();
        linkedList.removeLast();
        //전체 제거
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.clear();

        //----//

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        //전체 값 확인
        linkedList.forEach(System.out::println);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i);
        }
    }
}
