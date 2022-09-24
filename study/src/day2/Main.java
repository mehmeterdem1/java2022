package day2;

import ReCapDemo_Classes.DortIslem;
import day2.day2Hm.CustomerManager;
import day2.oop1.CorporateCustomer;
import day2.oop1.Customer;
import day2.oop1.IndividualCustomer;
import day2.oop1.Product;

import static day2.day2Hm.Methods2.*;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl1("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl1("image2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Kahve makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl1("image3.jpg");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0545645");
        individualCustomer.setCustomerNumber("1234");
        individualCustomer.setFirstName("Mehmet");
        individualCustomer.setLastName("Erdem");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(1);
        corporateCustomer.setCompanyName("computer company of Mehmet");
        corporateCustomer.setPhone("05464545");
        corporateCustomer.setTaxNumber("12345678910");
        corporateCustomer.setCustomerNumber("10");


        Customer[] customers = {individualCustomer, corporateCustomer};
        for (Customer customerElement : customers) {
            System.out.println(customerElement.getId());
        }

        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(mesaj);
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);

        int toplam = topla2(2,3,5,8);
        System.out.println(toplam);

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3,4);
        System.out.println(sonuc);
    }
}