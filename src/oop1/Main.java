package oop1;

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

    }
}