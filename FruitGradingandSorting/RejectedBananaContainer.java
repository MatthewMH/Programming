import java.util.ArrayList;

public class RejectedBananaContainer
{
    int total = 0;
    ArrayList<Banana> rejected_banana = new ArrayList<>();

    public void addRejectedfromContainer(BananaContainer bc)
    {
        total += bc.getReject();
    }

    public void addBanana(Banana b)
    {
        rejected_banana.add(b);
    }

    public int getTotalBanana()
    {
        return rejected_banana.size();
    }
}