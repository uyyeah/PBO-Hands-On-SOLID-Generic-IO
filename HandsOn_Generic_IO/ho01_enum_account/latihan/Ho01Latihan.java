enum AccountTypeLatihan {
    SAVINGS("Rekening Tabungan"),
    CREDIT("Rekening Kredit"),
    DEPOSIT("Rekening Deposito");

    private final String deskripsi;
    AccountTypeLatihan(String deskripsi) { this.deskripsi = deskripsi; }

    @Override
    public String toString() {
        return name() + " (" + deskripsi + ")";
    }
}
public class Ho01Latihan {
    public static void main(String[] args) {
        for (AccountTypeLatihan t : AccountTypeLatihan.values()) {
            System.out.println(t.toString());
        }
    }
}