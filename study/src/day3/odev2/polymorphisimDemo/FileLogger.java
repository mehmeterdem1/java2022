package day3.odev2.polymorphisimDemo;

public class FileLogger extends BaseLogger {
    public void log(String message) {
        System.out.println("Logged to file " + message);
    }
}
