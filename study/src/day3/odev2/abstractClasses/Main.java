package day3.odev2.abstractClasses;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        
        GameCalculater gameCalculater = new WomanGameCalculator();
    }
}
