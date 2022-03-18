import java.util.ArrayList;

public class BananaContainer extends Container
{
    ArrayList<Banana> banana = new ArrayList<>();

    public BananaContainer()
    {
        high = 0;
        low = 0;
        medium = 0;
        rejected = 0;
        totalFruit = 0;
        is_accepted = false;
    }

    public void addBanana(Banana b)
    {
        banana.add(b);
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

    public ArrayList<Banana> getBanana()
    {
        return banana;
    }

    public void set_isAccepted()
    {
        is_accepted = true;
    }

    public int getHigh()
    {
        return high;
    }

    public int getMedium()
    {
        return medium;
    }

    public int getLow()
    {
        return low;
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