public class Ho05Sebelum {
    public static boolean isEqualInt(int a, int b) {
        return a == b;
    }
    public static boolean isEqualString(String a, String b) {
        return a.equals(b);
    }
    public static void main(String[] args) {
        System.out.println(isEqualInt(5, 5));
        System.out.println(isEqualString("Hello", "World"));
    }
}