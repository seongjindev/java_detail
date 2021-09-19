package aboutconvert;

public class ExCharString {
    public static void main(String[] args) {
        char ch = 'A';
        String s1 = Character.toString(ch); //값이 null이면 NullPointerException 발생
        String s2 = String.valueOf(ch); //값이 null이면 null로 반환
        String s3 = ch + "";

        String st = "ABC";
        char[] c1 = st.toCharArray(); //배열로 받기
        char c2 = st.charAt(0); //특정 글자 빼기
    }
}
