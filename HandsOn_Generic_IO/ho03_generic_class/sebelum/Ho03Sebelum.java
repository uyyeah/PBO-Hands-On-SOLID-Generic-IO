class CellSebelum {
    private String data;
    public void setValue(String data) { this.data = data; }
    public String getValue() { return data; }
}
public class Ho03Sebelum {
    public static void main(String[] args) {
        CellSebelum cell = new CellSebelum();
        cell.setValue("Halo Generics");
        System.out.println("Value: " + cell.getValue());
    }
}