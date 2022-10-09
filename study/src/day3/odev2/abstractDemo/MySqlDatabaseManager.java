package day3.odev2.abstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("veri getirildi : My sql");
    }
}
