enum AccountTypeHo02Latihan {
    SAVINGS("SA", 2.5),
    CREDIT("CR", 18.0);

    private final String code;
    private final double interestRate;

    AccountTypeHo02Latihan(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() { return code; }
    public double getInterestRate() { return interestRate; }
}
public class Ho02Latihan {
    public static void main(String[] args) {
        for (AccountTypeHo02Latihan t : AccountTypeHo02Latihan.values()) {
            System.out.println("Nama: " + t.name() + " | Kode: " + t.getCode() + " | Bunga: " + t.getInterestRate() + "%");
        }
    }
}