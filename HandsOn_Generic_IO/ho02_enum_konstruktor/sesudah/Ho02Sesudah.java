enum AccountTypeHo02Sesudah {
    SAVINGS("SA"), CREDIT("CR");
    private final String code;
    AccountTypeHo02Sesudah(String code) { this.code = code; }
    public String getCode() { return code; }
}
public class Ho02Sesudah {
    public static void main(String[] args) {
        for (AccountTypeHo02Sesudah t : AccountTypeHo02Sesudah.values()) {
            System.out.println(t.name() + " -> " + t.getCode());
        }
    }
}