public class SayiBul {

    public void SayiBulma(int aranacak){

        int[] sayilar = new int[] {1, 3, 6, 8, 9, 12, 15, 20};

        for (int aranan : sayilar){
            if (aranan == aranacak){
                System.out.println("aranan sayı dizi içerisinde bulundu");
                break;
            }else {
                System.out.println("aranan sayı dizi içerisinde buulunamadı");
                break;
            }
        }
    }
}
