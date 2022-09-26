package day2.oop1;

public class Product extends day1.Product {
    public Product (int id, String name, String description, double price, int stockAmount, String kod){
        System.out.println("yapıcı blok çalıştı");
    }
    public Product(){}
    private double discount;
    private String imageUrl1;

    private String kod;


    //getter
    public double getDiscount() {
        return discount;
    }

    //setter
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImageUrl1() {
        return imageUrl1;
    }

    public void setImageUrl1(String imageUrl1) {
        this.imageUrl1 = imageUrl1;
    }


}
