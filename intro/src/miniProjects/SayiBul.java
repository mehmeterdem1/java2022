package miniProjects;

public class SayiBul {

    public void sayiBulma(int aranacak){

        int[] sayilar = new int[] {1, 3, 6, 8, 9, 12, 15, 20};

        boolean isThere = false;

        for (int aranan : sayilar){
            if (aranan == aranacak) {
                isThere = true;
                break;
            }
        }

        System.out.println("aranan sayı dizi içerisinde " + (isThere ? "bulundu" : "bulunmadı" ));

    }
}