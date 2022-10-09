package day3.odev2.polymorphisimDemo;

public class ConsolLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Logged to console " + message);
    }
}
