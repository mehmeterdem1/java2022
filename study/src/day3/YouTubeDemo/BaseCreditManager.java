package day3.YouTubeDemo;

public abstract class BaseCreditManager implements ICreditManager {
    public abstract void Calculate();

    public void Save() {
        System.out.println("kaydedildi");
    }

}
