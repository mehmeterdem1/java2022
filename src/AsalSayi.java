public class AsalSayi {
    public void SayiAsalMi(int number) {

        if (number > 3) {
            if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
                System.out.println(number + " asal sayı değildir");
            } else {
                System.out.println(number + " asal sayıdır");
            }
        } else if (number == 1) {
            System.out.println(number + "'den büyük bir sayı giriniz");
        } else {
            System.out.println(number + " asal bir sayıdır");
        }
    }
}
