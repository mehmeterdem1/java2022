package miniProjects;

import java.util.*;

public class KalinInceHarf {
    public void vovelControl(char charecter) {

        switch (charecter) {
            case 'A', 'a', 'I', 'ı', 'O', 'o', 'U', 'u' ->
                    System.out.println("'" + charecter + "'" + " kalın sesli bir harftir.");
            case 'E', 'İ', 'Ö', 'Ü', 'e', 'i', 'ö', 'ü' ->
                    System.out.println("'" + charecter + "'" + " ince sesli bir harftir.");
            default -> System.out.println("sesli bir harf giriniz");
        }
    }

    //Kalın ince harf bulma ArrayList
    public void alternativeVovelControl(char charecter) {

        List<Character> hardVovelList = new ArrayList<>();
        List<Character> softVovelList = new ArrayList<>();

        //kalın sesli harf listesi
        hardVovelList.add('A');
        hardVovelList.add('a');
        hardVovelList.add('I');
        hardVovelList.add('ı');
        hardVovelList.add('O');
        hardVovelList.add('o');
        hardVovelList.add('U');
        hardVovelList.add('u');

        //ince sesli harf listesi
        softVovelList.add('E');
        softVovelList.add('e');
        softVovelList.add('İ');
        softVovelList.add('i');
        softVovelList.add('Ö');
        softVovelList.add('ö');
        softVovelList.add('Ü');
        softVovelList.add('ü');

        if (hardVovelList.contains(charecter)) {
            System.out.println("'" + charecter + "'" + " kalın sesli bir harftir");
        } else if (softVovelList.contains(charecter)) {
            System.out.println("'" + charecter + "'" + " ince sesli bir harftir");
        }else {
            System.out.println("lütfen sesli bir harf giriniz");
        }
    }
}

