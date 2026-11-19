class CellSesudah<T> {
    private T data;
    public void setValue(T data) { this.data = data; }
    public T getValue() { return data; }
}
public class Ho03Sesudah {
    public static void main(String[] args) {
        CellSesudah<Integer> cInt = new CellSesudah<>();
        cInt.setValue(100);
        CellSesudah<String> cStr = new CellSesudah<>();
        cStr.setValue("Belajar Java");
        System.out.println("Int: " + cInt.getValue());
        System.out.println("Str: " + cStr.getValue());
    }
}