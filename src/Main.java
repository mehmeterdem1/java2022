public class Main {
    public static void main(String[] args) {

        System.out.println("\n----ASAL SAYI BULMA-----");

        AsalSayi asalSayi = new AsalSayi();
        asalSayi.sayiAsalMi(3);


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
        superSayi.superSayiHesapla(3);


        System.out.println("\n----ARKADAŞ SAYI BULMA-----");

        ArkadasSayilar arkadasSayilar = new ArkadasSayilar();
        arkadasSayilar.arkadasSayiHesapla(10, 5);


        System.out.println("\n----SAYI BULMA-----");

        SayiBul sayiBul = new SayiBul();
        sayiBul.sayiBulma(17);


    }
}