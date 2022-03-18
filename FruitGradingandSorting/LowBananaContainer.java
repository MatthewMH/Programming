import java.util.ArrayList;

public class LowBananaContainer
{
    int total = 0;
    ArrayList<Banana> low_banana = new ArrayList<>();

    public void addLowfromContainer(BananaContainer bc)
    {
        total += bc.getLow();
    }

    public void addBanana(Banana b)
    {
        low_banana.add(b);
    }

    public int getTotalBanana()
    {
        return low_banana.size();
    }
}