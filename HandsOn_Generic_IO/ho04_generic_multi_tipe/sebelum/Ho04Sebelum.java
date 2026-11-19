class PairSebelum {
    private Object first, second;
    public PairSebelum(Object first, Object second) { this.first = first; this.second = second; }
    public Object getFirst() { return first; }
    public Object getSecond() { return second; }
}
public class Ho04Sebelum {
    public static void main(String[] args) {
        PairSebelum p = new PairSebelum("Nilai", 95);
        System.out.println(p.getFirst() + ": " + p.getSecond());
    }
}