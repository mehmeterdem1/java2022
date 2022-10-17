package day3.odev3.logging;

import java.util.List;

public class DatabaseLogger implements ILogger, List<ILogger> {
    @Override
    public void logMessage(String message) {
        System.out.println("veritabanına eeklendi : " + message);
    }
}
