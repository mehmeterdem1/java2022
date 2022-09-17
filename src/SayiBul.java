public class SayiBul {

    public void SayiBulma(int aranacak){

        int[] sayilar = new int[] {1, 3, 6, 8, 9, 12, 15, 20};

        boolean isThere = false;

        for (int aranan : sayilar){
            if (aranan == aranacak) {
                isThere = true;
                break;
            }
        }

        if (isThere){
            System.out.println("aranan sayı dizi içerisinde bulundu");
        }else {
                System.out.println("aranan sayı dizi içerisinde bulunamadı");
            }
    }
}
