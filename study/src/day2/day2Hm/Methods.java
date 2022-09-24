package day2.day2Hm;

public class Methods {

    public void sayiBulmaca(int aranacak){

        int[] sayilar = new int[] {1, 3, 6, 8, 9, 12, 15, 20};

        boolean isThere = false;

        for (int aranan : sayilar){
            if (aranan == aranacak) {
                isThere = true;
                break;
            }
        }

        if(isThere) {
            mesajVer("sayı mevcuttur: " + aranacak);
        }else {
            mesajVer("sayı mevcut değildir: " + aranacak);
        }

    }

    public static void mesajVer (String mesaj){
        System.out.println(mesaj);
    }
}
