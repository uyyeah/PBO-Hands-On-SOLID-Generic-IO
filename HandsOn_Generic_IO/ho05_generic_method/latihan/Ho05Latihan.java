public class Ho05Latihan {
    public static <T extends Comparable<T>> boolean isEqual(T a, T b) {
        return a.compareTo(b) == 0;
    }
    public static void main(String[] args) {
        System.out.println("Int (5, 5): " + isEqual(5, 5));
        System.out.println("String (Hello, World): " + isEqual("Hello", "World"));
        System.out.println("Double (3.14, 3.14): " + isEqual(3.14, 3.14));
        System.out.println("Double (2.5, 3.0): " + isEqual(2.5, 3.0));
        System.out.println("Character ('A', 'A'): " + isEqual('A', 'A'));
        System.out.println("Character ('A', 'B'): " + isEqual('A', 'B'));
    }
}