class PairSesudah<T1, T2> {
    private T1 first;
    private T2 second;
    public PairSesudah(T1 first, T2 second) { this.first = first; this.second = second; }
    public void showTypes() {
        System.out.println(first.getClass().getName() + " & " + second.getClass().getName());
    }
}
public class Ho04Sesudah {
    public static void main(String[] args) {
        PairSesudah<String, Integer> p = new PairSesudah<>("Nilai", 95);
        p.showTypes();
    }
}