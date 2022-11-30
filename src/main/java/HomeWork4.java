public class HomeWork4 {
    public static void main(String[] args) {

        byte b = 127;
        short s = 259;
        int i = 56;
        long l = 43L;
        double d = 0.56;
        float f = 23.56f;

        System.out.println(b + s);
        System.out.println(i - l);
        System.out.println(i * l);
        System.out.println(f / d);
        System.out.println(i % l);
        System.out.println((byte) (b + 5));
        int overflow = Integer.MAX_VALUE;
        System.out.println(overflow);
        System.out.println(overflow + 999);
    }
}
