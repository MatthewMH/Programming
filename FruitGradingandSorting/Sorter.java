import java.util.ArrayList;
import java.util.Date;

public class Sorter
{
    int totalContainer = 0;
    int totalStroberiContainer = 0;
    int totalStroberiRejected = 0;
    int totalBananaContainer = 0;
    int totalBananaRejected = 0;

    public void sortStroberiContainer(StroberiContainer sc, HighStroberiContainer hsc, LowStroberiContainer lsc, MediumStroberiContainer msc, RejectedStroberiContainer rsc)
    {
        int i;
        ArrayList<Stroberi> stroberi = sc.getStroberi();
        if(sc.get_isAccepted())
        {
            hsc.addHighfromContainer(sc);
            msc.addMediumfromContainer(sc);
            lsc.addLowfromContainer(sc);
            for(i = 0; i < stroberi.size(); i++)
            {
                if(stroberi.get(i).getGrade().compareTo("HIGH") == 0)
                {
                    hsc.addStroberi(stroberi.get(i));
                }
                else if(stroberi.get(i).getGrade().compareTo("MEDIUM") == 0)
                {
                    msc.addStroberi(stroberi.get(i));
                }
                else if(stroberi.get(i).getGrade().compareTo("LOW") == 0)
                {
                    lsc.addStroberi(stroberi.get(i));
                }
                else
                {
                    rsc.addStroberi(stroberi.get(i));
                }
            }
            totalStroberiContainer++;
        }
        else
        {
            totalStroberiContainer++;
            totalStroberiRejected++;
        }
        totalContainer++;
    }

    public void sortBananaContainer(BananaContainer bc, HighBananaContainer hbc, LowBananaContainer lbc, MediumBananaContainer mbc, RejectedBananaContainer rbc)
    {
        int i;
        ArrayList<Banana> banana = bc.getBanana();
        if(bc.get_isAccepted())
        {
            hbc.addHighfromContainer(bc);
            mbc.addMediumfromContainer(bc);
            lbc.addLowfromContainer(bc);
            for(i = 0; i < banana.size(); i++)
            {
                if(banana.get(i).getGrade().compareTo("HIGH") == 0)
                {
                    hbc.addBanana(banana.get(i));
                }
                else if(banana.get(i).getGrade().compareTo("MEDIUM") == 0)
                {
                    mbc.addBanana(banana.get(i));
                }
                else if(banana.get(i).getGrade().compareTo("LOW") == 0)
                {
                    lbc.addBanana(banana.get(i));
                }
                else
                {
                    rbc.addBanana(banana.get(i));
                }
            }
            totalBananaContainer++;
        }
        else
        {
            totalBananaContainer++;
            totalBananaRejected++;
        }
        totalContainer++;
    }

    public void showSortingReport(HighStroberiContainer hsc, LowStroberiContainer lsc, MediumStroberiContainer msc, RejectedStroberiContainer rsc, 
    HighBananaContainer hbc, LowBananaContainer lbc, MediumBananaContainer mbc, RejectedBananaContainer rbc)
    {
        System.out.println("***DAILY SORTING REPORT***");
        System.out.printf("Report Generated at : %s\n\n", new Date());
        System.out.printf("Total Container Sorted : %d Container\n", totalContainer);
        System.out.printf("Strawberry Container Sorted : %d Container\n", totalStroberiContainer);
        System.out.printf("Strawberry Container Rejected : %d Container\n", totalStroberiRejected);
        System.out.printf("Banana Container Sorted : %d Container\n", totalBananaContainer);
        System.out.printf("Banana Container Rejected : %d Container\n\n", totalBananaRejected);
        System.out.println("Sorting Details : Strawberry");
        System.out.printf("High Grade\t: %d Strawberry\n", hsc.getTotalStroberi());
        System.out.printf("Medium Grade\t: %d Strawberry\n", msc.getTotalStroberi());
        System.out.printf("Low Grade\t: %d Strawberry\n", lsc.getTotalStroberi());
        System.out.printf("Reject\t: %d Strawberry\n\n", rsc.getTotalStroberi());
        System.out.println("Sorting Details : Banana");
        System.out.printf("High Grade\t: %d Banana\n", hbc.getTotalBanana());
        System.out.printf("Medium Grade\t: %d Banana\n", mbc.getTotalBanana());
        System.out.printf("Low Grade\t: %d Banana\n", lbc.getTotalBanana());
        System.out.printf("Reject\t: %d Banana\n\n", rbc.getTotalBanana());
    }
}