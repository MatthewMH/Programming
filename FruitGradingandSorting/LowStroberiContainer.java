import java.util.ArrayList;

public class LowStroberiContainer
{
    int total = 0;
    ArrayList<Stroberi> low_stroberi = new ArrayList<>();

    public void addLowfromContainer(StroberiContainer sc)
    {
        total += sc.getLow();
    }

    public void addStroberi(Stroberi s)
    {
        low_stroberi.add(s);
    }

    public int getTotalStroberi()
    {
        return low_stroberi.size();
    }
}