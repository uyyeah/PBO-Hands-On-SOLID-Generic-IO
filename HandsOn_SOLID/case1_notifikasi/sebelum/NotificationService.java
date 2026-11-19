public class NotificationService {
    public void send(String type, String message) {
        if (type.equals("EMAIL")) {
            System.out.println("Mengirim EMAIL: " + message);
        } else if (type.equals("SMS")) {
            System.out.println("Mengirim SMS: " + message);
        } else if (type.equals("WHATSAPP")) {
            System.out.println("Mengirim WhatsApp: " + message);
        } else {
            System.out.println("Tipe notifikasi tidak dikenali");
        }
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send("EMAIL", "Selamat datang di portal akademik!");
        service.send("TELEGRAM", "Tes kanal baru");
    }
}