package day3.odev2.abstractDemo;

public class SqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("veri getirildi : Sql server");
    }
}
