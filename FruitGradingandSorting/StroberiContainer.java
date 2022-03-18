import java.util.ArrayList;

public class StroberiContainer extends Container
{
    ArrayList<Stroberi> stroberi = new ArrayList<>();

    public StroberiContainer()
    {
        high = 0;
        low = 0;
        medium = 0;
        rejected = 0;
        totalFruit = 0;
        is_accepted = false;
    }

    public void addStroberi(Stroberi s)
    {
        stroberi.add(s);
    }

    public void addHigh()
    {
        high++;
    }

    public void addMedium()
    {
        medium++;
    }

    public void addLow()
    {
        low++;
    }

    public void addReject()
    {
        rejected++;
    }

    public void addTotalFruit()
    {
        totalFruit++;
    }

    public ArrayList<Stroberi> getStroberi()
    {
        return stroberi;
    }

    public void set_isAccepted()
    {
        is_accepted = true;
    }

    public int getHigh()
    {
        return high;
    }

    public int getLow()
    {
        return low;
    }

    public int getMedium()
    {
        return medium;
    }

    public int getReject()
    {
        return rejected;
    }

    public int getTotalFruit()
    {
        return totalFruit;
    }
    public boolean get_isAccepted()
    {
        return is_accepted;
    }

}