package day3.odev2.staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "fare";
        product.price = 10;
        manager.add(product);

    }
}
