package regularexpression;

public class ExRegularExpression {
    public static void main(String[] args) {
        String a = "!@#$%^&*()_+{}[];':\"|,./<>?";
        String a2 = "?!@#$%^&*()_+{}[];':\"|,./<>?@#*{}||}{}[]][$)@#_@+_$+!*@#!+$+#++!@_)$@#)*$&^?>?><?><?><?";
        String s = a.replaceAll("[!@#[$]%\\^&[*]\\(\\)_[+]\\{\\}\\[\\];':\"[|],./<>\\?]", "");
        String s2 = a2.replaceAll("[!@#[$]%\\^&[*]\\(\\)_[+]\\{\\}\\[\\];':\"[|],./<>\\?]", "");
        String s3 = a2.replaceAll("[?]", "");
        String s4 = a2.replaceAll("\\?", "");
        String s5 = a2.replaceAll("[!@[?]]", "");
        String s6 = a2.replaceAll("[!@\\?]", "");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}
