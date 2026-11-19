public class TelegramNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim Telegram: " + message);
    }
}