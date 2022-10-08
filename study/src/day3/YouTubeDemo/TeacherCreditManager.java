package day3.YouTubeDemo;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void Calculate() {
        System.out.println("öğretmen kredisi hesaplandı");
    }

    @Override
    public void Save() {
        super.Save();
        //hghdfgchwg
    }
}
