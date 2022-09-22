package intro.miniProjects;

public class ArkadasSayilar {
    public void arkadasSayiHesapla(int number1, int number2) {

        int number1BolenlerToplam = 0;
        int number2BolenlerToplam = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                number1BolenlerToplam = number1BolenlerToplam + i;
            }
        }

        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                number2BolenlerToplam = number2BolenlerToplam + i;
            }
        }

        System.out.println("ilk sayının kendisi hariç bölenler toplamı: " + number1BolenlerToplam);
        System.out.println("ikinci sayının kendisi hariç bölenler toplamı: " + number2BolenlerToplam + "\n");


        if (number1BolenlerToplam == number2 && number2BolenlerToplam == number1) {
            System.out.println(number1 + " ve " + number2 + " arkadaş sayıdır");
        } else {
            System.out.println(number1 + " ve " + number2 + " arkadaş sayı değildir");
        }
    }

}
