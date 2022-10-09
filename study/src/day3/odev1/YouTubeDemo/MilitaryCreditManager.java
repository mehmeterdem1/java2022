package day3.odev1.YouTubeDemo;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void Calculate() {
        System.out.println("asker kredisi hesaplandı");
    }
}
