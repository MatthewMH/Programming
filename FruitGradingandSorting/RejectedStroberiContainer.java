import java.util.ArrayList;

public class RejectedStroberiContainer
{
    int total = 0;
    ArrayList<Stroberi> rejected_stroberi = new ArrayList<>();

    public void addRejectedfromContainer(StroberiContainer sc)
    {
        total += sc.getReject();
    }

    public void addStroberi(Stroberi s)
    {
        rejected_stroberi.add(s);
    }

    public int getTotalStroberi()
    {
        return rejected_stroberi.size();
    }
}