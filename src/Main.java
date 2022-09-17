public class Main {
    public static void main(String[] args) {

        /*System.out.println("HELLO WORLD!");

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
        }*/


        System.out.println("\n----ASAL SAYI BULMA-----");

        AsalSayi asalSayi = new AsalSayi();
        asalSayi.SayiAsalMi(3);


        System.out.println("\n----ENGİN HOCA ASAL SAYI BULMA-----");

        AsalSayi enginHocaAsalSayi = new AsalSayi();
        enginHocaAsalSayi.enginHocaAsalSayi(3);


        System.out.println("\n----İNCE VE KALIN SESLİ HARF KONTROLÜ-----");

        KalinInceHarf kalinInceHarf = new KalinInceHarf();
        kalinInceHarf.vovelControl('b');


        System.out.println("\n----ALTERNATİF İNCE VE KALIN SESLİ HARF KONTROLÜ-----");

        kalinInceHarf.alternativeVovelControl('c');


        System.out.println("\n----SÜPER SAYI BULMA-----");

        SuperSayi superSayi = new SuperSayi();
        superSayi.SuperSayiHesapla(3);


        System.out.println("\n----ARKADAŞ SAYI BULMA-----");

        ArkadasSayilar arkadasSayilar = new ArkadasSayilar();
        arkadasSayilar.ArkadasSayiHesapla(10, 5);


        System.out.println("\n----SAYI BULMA-----");

        SayiBul sayiBul = new SayiBul();
        sayiBul.SayiBulma(17);




    }
}