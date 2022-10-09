package day3.odev2.polymorphisimDemo;

public class DatabaseLogger extends BaseLogger {

    public void log(String message) {
        System.out.println("Logged to databasse " + message);
    }
}
