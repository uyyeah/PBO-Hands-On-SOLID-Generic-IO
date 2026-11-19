import java.util.List;

interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[Email] Mengirim pesan: " + message);
    }
}

class SMSNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[SMS] Mengirim pesan: " + message);
    }
}

class WhatsAppNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Mengirim pesan: " + message);
    }
}

class TelegramNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[Telegram] Mengirim pesan: " + message);
    }
}

class PushNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("[Push Notification] Mengirim pesan: " + message);
    }
}

class NotificationService {
    private final List<Notifier> notifiers;

    public NotificationService(List<Notifier> notifiers) {
        this.notifiers = notifiers;
    }

    public void sendTo(Notifier notifier, String message) {
        notifier.send(message);
    }

    public void broadcast(String message) {
        for (Notifier n : notifiers) {
            n.send(message);
        }
    }
}

public class Latihan1Sesudah {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();
        Notifier sms = new SMSNotifier();
        Notifier wa = new WhatsAppNotifier();
        Notifier telegram = new TelegramNotifier();
        Notifier push = new PushNotifier();

        NotificationService service = new NotificationService(
            List.of(email, sms, wa, telegram, push)
        );

        System.out.println("=== Kirim per kanal ===");
        service.sendTo(email, "Halo, ini email test!");
        service.sendTo(sms, "Ini SMS test!");
        service.sendTo(wa, "Ini pesan WhatsApp test!");

        System.out.println();
        System.out.println("=== Broadcast ke semua kanal ===");
        service.broadcast("Pengumuman: kuliah PBO dipindah ke Ruang 301.");
    }
}