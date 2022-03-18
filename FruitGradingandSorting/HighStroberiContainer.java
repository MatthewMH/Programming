import java.util.ArrayList;

public class HighStroberiContainer
{
    int total = 0;
    ArrayList<Stroberi> high_stroberi = new ArrayList<>();

    public void addHighfromContainer(StroberiContainer sc)
    {
        total += sc.getHigh();
    }

    public void addStroberi(Stroberi s)
    {
        high_stroberi.add(s);
    }

    public int getTotalStroberi()
    {
        return high_stroberi.size();
    }
}