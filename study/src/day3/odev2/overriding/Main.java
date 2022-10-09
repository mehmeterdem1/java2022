package day3.odev2.overriding;

public class Main {
    public static void main(String[] args) {
        /*OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        System.out.println(ogretmenKrediManager.hesapla(1000));*/

        BaseCrediManager[] krediManagers = new BaseCrediManager[]{new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for(BaseCrediManager kredimanager : krediManagers) {
            System.out.println(kredimanager.hesapla(1000));
        }
    }
}
