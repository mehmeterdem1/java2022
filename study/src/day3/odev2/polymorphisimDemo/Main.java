package day3.odev2.polymorphisimDemo;

public class Main {
    public static void main(String[] args) {

        /*BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger(), new BaseLogger(), new ConsolLogger()};
        for (BaseLogger logger : loggers) {
            logger.Log("log mesajı");
        }*/

        CustomeManager customeManager = new CustomeManager(new FileLogger());
        customeManager.add();

    }
}
