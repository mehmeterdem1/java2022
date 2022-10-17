package day3.odev3.logging;

public class MailLogger implements ILogger{

    @Override
    public void logMessage(String message) {
        System.out.println("mail atıldı : " + message);
    }
}
