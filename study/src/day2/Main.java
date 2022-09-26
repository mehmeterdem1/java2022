package day2;

import day1.ProductManager;
import day2.day2Hm.*;
import day2.day2Hm.ReCapDemo_Classes.DortIslem;
import day2.oop1.CorporateCustomer;
import day2.oop1.Customer;
import day2.oop1.IndividualCustomer;
import day2.oop1.Product;
import static day2.day2Hm.Methods2.*;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(2, "Laptop", "lenovo laptop", 4000, 3, "siyah");
        product1.setName("Delonghi Kahve makinesi");
        product1.setDiscount(7);
        product1.setPrice(7500);
        product1.setStockAmount(3);
        product1.setImageUrl1("image1.jpg");

        Product product2 = new Product(2, "Laptop", "hp laptop", 3200, 2, "siyah");
        product2.setName("Smeg Kahve makinesi");
        product2.setDiscount(7);
        product2.setPrice(7500);
        product2.setStockAmount(3);
        product2.setImageUrl1("image2.jpg");


        Product product3 = new Product(4, "Laptop", "lg laptop", 2000, 5, "siyah");
        product3.setName("Kitchen Kahve makinesi");
        product3.setDiscount(7);
        product3.setPrice(7500);
        product3.setStockAmount(3);
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
        int sayi = topla(15, 7);
        System.out.println(sayi);

        int toplam = topla2(2, 3, 5, 8);
        System.out.println(toplam);

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Topla(3, 4);
        System.out.println(sonuc);

        Product product = new Product(1, "Laptop", "asus laptop", 3000, 3, "siyah");

        ProductManager productManager = new ProductManager();
        productManager.addProduct(product);

        productManager.addProduct2(1, "jhv", "lkb", 2, 200);

        DortIslem2 dortIslem1 = new DortIslem2();
        System.out.println(dortIslem1.topla(2,3));


        Customer2 customer2 = new Customer2();
        Employee employee = new Employee();

        EmployeManager employeManager = new EmployeManager();
        CustomerManager2 customerManager2 = new CustomerManager2();

        employeManager.BestEmployee();

        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        ogretmenKrediManager.Hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new TarimKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());



    }

}