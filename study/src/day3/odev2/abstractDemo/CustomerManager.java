package day3.odev2.abstractDemo;

public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public void getCustomers() {
        databaseManager.getData();
    }
}
