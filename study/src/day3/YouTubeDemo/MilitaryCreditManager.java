package day3.YouTubeDemo;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void Calculate() {
        System.out.println("asker kredisi hesaplandı");
    }
}
