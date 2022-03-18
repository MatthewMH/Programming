import java.util.ArrayList;

public class HighBananaContainer
{
    int total = 0;
    ArrayList<Banana> high_banana = new ArrayList<>();

    public void addHighfromContainer(BananaContainer bc)
    {
        total += bc.getHigh();
    }

    public void addBanana(Banana b)
    {
        high_banana.add(b);
    }

    public int getTotalBanana()
    {
        return high_banana.size();
    }
}