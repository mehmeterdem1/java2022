package day3.odev2.interfaces;

public class CustomerManager {
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
    public void add() {
        //iş kodları
        customerDal.Add();

    }
}
