package day3.odev3.logging;

public class FileLogger implements ILogger{


    @Override
    public void logMessage(String message) {
        System.out.println("kurs eklendi : " + message);

    }
}
