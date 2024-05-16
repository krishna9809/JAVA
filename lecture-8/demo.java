import mypack.Simple;


public class demo {

    public static void main(String[] args) {
        Simple s1 = new Simple();
        s1.name = "here we are using package";
        System.out.println(s1.name);
        s1.voice();
    }
}