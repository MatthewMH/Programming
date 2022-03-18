import java.util.ArrayList;

public class MediumStroberiContainer
{
    int total = 0;
    ArrayList<Stroberi> medium_stroberi = new ArrayList<>();

    public void addMediumfromContainer(StroberiContainer sc)
    {
        total += sc.getMedium();
    }

    public void addStroberi(Stroberi s)
    {
        medium_stroberi.add(s);
    }

    public int getTotalStroberi()
    {
        return medium_stroberi.size();
    }
}