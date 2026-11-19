class AccountSebelum {
    private String type;
    public AccountSebelum(String type) { this.type = type; }
    public String getType() { return type; }
}
public class Ho01Sebelum {
    public static void main(String[] args) {
        AccountSebelum a1 = new AccountSebelum("SAVINGS");
        AccountSebelum a2 = new AccountSebelum("CREDIT");
        System.out.println("Type 1: " + a1.getType());
        System.out.println("Type 2: " + a2.getType());
    }
}