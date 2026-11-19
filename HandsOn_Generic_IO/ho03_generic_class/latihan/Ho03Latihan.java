class CellLatihan<T> {
    private T data;
    public void setValue(T data) { this.data = data; }
    public T getValue() { return data; }
    public void displayType() {
        System.out.println("Tipe data: " + (data != null ? data.getClass().getName() : "null"));
    }
}
public class Ho03Latihan {
    public static void main(String[] args) {
        CellLatihan<Integer> intCell = new CellLatihan<>();
        intCell.setValue(42);
        System.out.println("Nilai: " + intCell.getValue());
        intCell.displayType();

        CellLatihan<String> strCell = new CellLatihan<>();
        strCell.setValue("PBO Generic");
        System.out.println("Nilai: " + strCell.getValue());
        strCell.displayType();
    }
}