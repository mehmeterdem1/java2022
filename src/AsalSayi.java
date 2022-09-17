public class AsalSayi {
    private static void asalSayi(int number) {
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " asal sayı değildir");
        } else {
            System.out.println(number + " asal sayıdır");
        }
    }

    public void SayiAsalMi(int number) {

        if (number > 0) {
            if (number > 3) {
                asalSayi(number);
            } else if (number == 1) {
                System.out.println(number + "'den büyük bir sayı giriniz");
            } else {
                System.out.println(number + " asal bir sayıdır");
            }
        } else {
            System.out.println("negatif sayılar asal sayı değildir");
        }
    }

    public void enginHocaAsalSayi(int number) {

        boolean isPrime = true;

        if (number < 1) {
            System.out.println("negatif sayılar asal sayı değildir");
        } else if (number == 1) {
            System.out.println("1 asal sayı değildir");
        }

        if (number > 2) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println(number + " asal sayı" + (isPrime ? "dır" : " değildir"));
        } else if (number == 2) {
            System.out.println(number + " asal sayıdır");
        }
    }
}
