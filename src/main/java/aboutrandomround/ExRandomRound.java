package aboutrandomround;

public class ExRandomRound {
    public static void main(String[] args) {
        //0.0 <= Math.random() < 1.0
        //0.0 <= Math.random() * 10 < 10.0
        double v = Math.random() * 10; //0.0 부터 10.0 미만의 랜덤한 수를 받을 수 있다
        System.out.println("v = " + v);

        //10.0 <= Math.random() * 10 + 10 < 20.0
        double v1 = Math.random() * 10 + 10;
        System.out.println("v1 = " + v1);

        //정수로 변환
        int v2 = (int)(Math.random() * 10 + 10);
        System.out.println("v2 = " + v2);

        //Math.round() 소수점 첫째자리에서 반올림한다
        double a = 123.4567;
        long round = Math.round(a);
        System.out.println("round = " + round);

        //소수점 둘째자리에서 반올림을 하려면 그 숫자를 소수점 첫째자리로 옮기면 된다
        double l = Math.round(a * 10) / 10.0; //첫째자리로 옮기로 다시 나눠서 내려준다 나눌 때 .0을 사용하지 않으면 정수가 되므로 .0을 붙여준다
        System.out.println("l = " + l);

    }
}
