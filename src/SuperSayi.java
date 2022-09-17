public class SuperSayi{

    public void SuperSayiHesapla(int number){

        int bolenler;
        int superSayi = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                bolenler = i;
                superSayi = superSayi + bolenler;
            }
        }


        if (number * 2 == superSayi) {
            System.out.println(number + " süper sayıdır");
        } else {
            System.out.println(number + " süper sayı değildir");
        }
    }
}
