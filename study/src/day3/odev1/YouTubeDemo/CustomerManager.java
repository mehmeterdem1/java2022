package day3.odev1.YouTubeDemo;

public class CustomerManager {
    private ICreditManager _creditManager;
    private Customer _customer;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        _customer = customer;
        _creditManager = creditManager;
    }

    public void Save() {
        System.out.println("müşteri kaydedildi : " );
    }

    public void Delete() {
        System.out.println("müşteri silindi : " );
    }

    public void GiveCredit() {
        _creditManager.Calculate();
        System.out.println("kredi verildi");
    }
}
