package aboutenum;

public class ExEnum {
    public static final String JANUARY = "1";
    public static final String FEBRUARY = "2";
    public static final String MARCH = "3";

    public static void main(String[] args) {
        String calendar1;
        calendar1 = JANUARY;
        //calendar1 = "1"; //내용을 바꿀 수 있다

        Calender calender2;
        calender2 = Calender.JANUARY;
        //calender2 = "1"; //타입이 다르므로 에러가 발생

        System.out.println(calender2.nums);
    }
}
enum Calender {
    JANUARY("1"), FEBRUARY("2"), MARCH("3"); //코드가 단순해 진다

    public String nums;
    Calender(String nums) { //enum은 사실 클래스이기 때문에 생성자를 가질 수 있다
        this.nums = nums;
    }
}

//enum Calender {
//    JANUARY, FEBRUARY, MARCH;
//}
//위의 enum Calender는 아래와 같다
//class Calender{
//    public static final Calender JANUARY  = new Calender();
//    public static final Calender FEBRUARY  = new Calender();
//    public static final Calender MARCH = new Calender();
//    private Calender(){}
//}
