import java.util.ArrayList;

public abstract class Container
{
    protected int high;
    protected int low;
    protected int medium;
    protected int rejected;
    protected int totalFruit;
    protected boolean is_accepted;

    abstract public void addHigh();
    abstract public void addLow();
    abstract public void addMedium();
    abstract public void addReject();
    abstract public void addTotalFruit();
    abstract public void set_isAccepted();
    abstract public int getHigh();
    abstract public int getLow();
    abstract public int getMedium();
    abstract public int getReject();
    abstract public int getTotalFruit();
    abstract public boolean get_isAccepted();
}