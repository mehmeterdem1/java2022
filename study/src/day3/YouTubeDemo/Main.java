package day3.YouTubeDemo;

public class Main {
    public static void main(String[] args) {
        /*CreditManager creditManager = new CreditManager();
        creditManager.Calculate();

        Customer customer = new Customer();
        customer.id = 1;

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.taxNumber = "1211212121";
        company.companyName = "arçelik";

        Person person = new Person();
        person.nationalIdentity = "515151";*/

        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.GiveCredit();

    }
}