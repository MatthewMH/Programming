import java.util.ArrayList;

public class MediumBananaContainer
{
    int total = 0;
    ArrayList<Banana> medium_banana = new ArrayList<>();

    public void addMediumfromContainer(BananaContainer bc)
    {
        total += bc.getMedium();
    }

    public void addBanana(Banana b)
    {
        medium_banana.add(b);
    }

    public int getTotalBanana()
    {
        return medium_banana.size();
    }
}