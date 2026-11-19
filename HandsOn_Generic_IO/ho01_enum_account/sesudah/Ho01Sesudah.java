enum AccountTypeSesudah { SAVINGS, CREDIT }
class AccountSesudah {
    private AccountTypeSesudah type;
    public AccountSesudah(AccountTypeSesudah type) { this.type = type; }
    public AccountTypeSesudah getType() { return type; }
}
public class Ho01Sesudah {
    public static void main(String[] args) {
        AccountSesudah a1 = new AccountSesudah(AccountTypeSesudah.SAVINGS);
        AccountSesudah a2 = new AccountSesudah(AccountTypeSesudah.CREDIT);
        System.out.println("Type 1: " + a1.getType());
        System.out.println("Type 2: " + a2.getType());
    }
}