package aboutreferencecopy;

public class ExReferenceCopy {
    public static void main(String[] args){
        int a = 10;
        int b = a;

        System.out.println(a);
        System.out.println(b);

        a = 11;

        System.out.println(a);
        System.out.println(b); //b의 값은 바뀌지 않는다, 값이 복제되었다, 기본데이터형은 복제가 된다

        int[] a1 = {1,2,3};
        int[] b1 = a1;

        for (int i : a1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b1) {
            System.out.print(i + " ");
        }
        System.out.println();

        a1[0] = 4;
        a1[1] = 5;
        a1[2] = 6;

        for (int i : a1) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b1) {
            System.out.print(i + " "); //b값이 바뀌었다, 값이 참조되었다, 기본 데이터형을 제외한 모든 데이터 타입은 참조데이터 타입이다, 참조형 데이터는 참조된다
        }
        System.out.println();

        System.out.println(a1);
        System.out.println(b1); //주소값이 같다

        //값만 복사
        int[] a2 = {1,2,3};
//        int[] b2 = Arrays.copyOf(a3, a3.length);
        int[] b2 = a2.clone();

        for (int i : a2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b2) {
            System.out.print(i + " ");
        }
        System.out.println();

        a2[0] = 4;
        a2[1] = 5;
        a2[2] = 6;

        for (int i : a2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(a2);
        System.out.println(b2); //주소값이 다르다









    }
}
