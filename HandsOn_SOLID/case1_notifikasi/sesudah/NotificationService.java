public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void notify(String message) {
        notifier.send(message);
    }

    public static void main(String[] args) {
        NotificationService waService = new NotificationService(new WhatsAppNotifier());
        waService.notify("Pengumpulan tugas akan ditutup malam ini!");

        NotificationService emailService = new NotificationService(new EmailNotifier());
        emailService.notify("Selamat datang di portal akademik!");

        NotificationService tgService = new NotificationService(new TelegramNotifier());
        tgService.notify("Kanal Telegram berhasil ditambahkan!");
    }
}