import java.util.ArrayList;

public class StroberiSorter extends Sorter
{
    int i;

    public int countRejectedContainer(ArrayList<StroberiContainer> s)
    {
        for(i = 0; i < s.size(); i++)
        {
            if(!(s.get(i).isAcceptedorNot()))
            {
                rejected++;
            }
        }
        return rejected; 
    }

    public void sort(ArrayList<StroberiContainer> s)
    {
        for(i = 0; i < s.size(); i++)
        {
            if(s.get(i).isAcceptedorNot())
            {
                high_total += s.get(i).getHigh();
                medium_total += s.get(i).getMedium();
                low_total += s.get(i).getLow();
                rejected_total += s.get(i).getReject();
            }
        } 
    }

    public void report()
    {
        System.out.println("Sorting Details: Strawberry");
        System.out.printf("High Grade\t: %d Strawberry\n", high_total);
        System.out.printf("Medium Grade\t: %d Strawberry\n", medium_total);
        System.out.printf("Low Grade\t: %d Strawberry\n", low_total);
        System.out.printf("Reject\t: %d Strawberry\n", rejected_total);
    }

}