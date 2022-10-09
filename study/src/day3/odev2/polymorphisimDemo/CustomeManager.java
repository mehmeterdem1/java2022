package day3.odev2.polymorphisimDemo;

public class CustomeManager {

    private BaseLogger logger;

    public CustomeManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("müşteri eklendi");
        this.logger.log("mesaj log");
    }
}
