public class SuperClass {
    public int x = 10;
    static int y = 10;

    SuperClass() {
//        x = y++;
        x = y;
        y++;
    }

    public int foo() {
        return x;
    }

    public static int goo() {
        return y;
    }
}




