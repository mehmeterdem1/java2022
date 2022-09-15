public class Main {
    public static void main(String[] args) {

        System.out.println("HELLO WORLD!");

        //değişken isimleri java'da camelCase yazılır..
        String ortaMetin = "ilginizi çekebilir";
        String altMetin = "vade süresi";

        System.out.println(ortaMetin);
        System.out.println(altMetin);

        //integer
        int vade = 12;

        double dolarDun = 18.20;
        double dolarBugun = 18.25;

        boolean dolarDustuMu = true;

        String okYonu = "";

        if (dolarBugun < dolarDun) { //false
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun == dolarDun) {
            okYonu = "equals.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "up.svg";
            System.out.println(okYonu);

        }

        //array

        String[] krediler = {"hızlı kredi", "maaşını halkbanktan alanlar", "mutlu emekli"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }


    }
}