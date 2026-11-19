class NotificationService {
    public void sendEmail(String message) {
        System.out.println("Mengirim Email: " + message);
    }

    public void sendSMS(String message) {
        System.out.println("Mengirim SMS: " + message);
    }

    public void sendWhatsApp(String message) {
        System.out.println("Mengirim WhatsApp: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationService notif = new NotificationService();
        notif.sendEmail("Halo, ini email test!");
        notif.sendSMS("Ini SMS test!");
        notif.sendWhatsApp("Ini pesan WhatsApp test!");
    }
}