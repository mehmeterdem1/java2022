package intro;

import intro.miniProjects.*;

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


        DortIslem dortIslem = new DortIslem();

        int sonucTopla = dortIslem.Topla(3,4);
        int sonucCarp = dortIslem.Carp(3,4);
        int sonucCikar = dortIslem.Cikar(3,4);
        double sonucBol = dortIslem.Bol(12,4);

        System.out.println(sonucTopla);
        System.out.println(sonucBol);
        System.out.println(sonucCarp);
        System.out.println(sonucCikar);


        Product product = new Product();

        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setStockAmount(3);
        product.setPrice(5000);

        ProductManager productManager = new ProductManager();
        productManager.addProduct(product);


    }
}