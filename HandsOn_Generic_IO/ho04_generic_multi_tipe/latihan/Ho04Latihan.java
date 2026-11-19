class PairLatihan<T1, T2> {
    private T1 first;
    private T2 second;
    public PairLatihan(T1 first, T2 second) { this.first = first; this.second = second; }
    public void showTypes() {
        System.out.println(first.getClass().getName() + " & " + second.getClass().getName());
    }
    @SuppressWarnings("unchecked")
    public void swap() {
        Object temp = first;
        first = (T1) second;
        second = (T2) temp;
    }
    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
public class Ho04Latihan {
    public static void main(String[] args) {
        PairLatihan<Integer, String> p1 = new PairLatihan<>(1, "Satu");
        System.out.println("Awal p1: " + p1);
        p1.showTypes();
        p1.swap();
        System.out.println("Setelah swap p1: " + p1);

        PairLatihan<Double, Boolean> p2 = new PairLatihan<>(3.5, true);
        System.out.println("Awal p2: " + p2);
        p2.showTypes();
        p2.swap();
        System.out.println("Setelah swap p2: " + p2);
    }
}