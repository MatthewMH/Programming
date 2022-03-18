import java.util.Date;
import java.util.ArrayList;

public class Grader
{
    public void countStroberi(StroberiContainer sc)
    {
		int i;
        ArrayList<Stroberi> stroberi = sc.getStroberi();
		for(i = 0; i < stroberi.size(); i++)
		{
			sc.addTotalFruit();
		}
    }

    public void gradeStroberiContainer(StroberiContainer sc)
    {
        int i;
        ArrayList<Stroberi> stroberi = sc.getStroberi();
        for(i = 0; i < stroberi.size(); i++)
        {
            if(stroberi.get(i).getWeight() > 18 && (stroberi.get(i).getColor().compareTo("DARK_RED") == 0 || 
            stroberi.get(i).getColor().compareTo("MEDIUM_RED") == 0))
		    {
			    sc.addHigh();
				stroberi.get(i).setGrade("HIGH");
		    }
		    else if((stroberi.get(i).getWeight() > 12 && stroberi.get(i).getWeight() <= 18) && (stroberi.get(i).getColor().compareTo("DARK_RED") == 0 || 
            (stroberi.get(i).getColor().compareTo("MEDIUM_RED") == 0)))
		    {
			    sc.addMedium();
				stroberi.get(i).setGrade("MEDIUM");
		    }
		    else if((stroberi.get(i).getWeight() > 7 && stroberi.get(i).getWeight() <= 12) && stroberi.get(i).getColor().compareTo("DARK_RED") == 0)
		    {
			    sc.addLow();
				stroberi.get(i).setGrade("LOW");
		    }
		    else
		    {
			    sc.addReject();
				stroberi.get(i).setGrade("REJECT");
		    }
        }
    }

    public void showStroberiGradingResult(StroberiContainer sc)
	{
		System.out.println("***GRADING REPORT***");
		System.out.printf("Container Content : %d Strawberry\n", sc.getTotalFruit());
		Date date = new Date();
		System.out.printf("Grading Time : %s\n\n", date);
		System.out.println("GRADING Details\n");
		System.out.printf("High Grade\t: %d Strawberry\n", sc.getHigh());
		System.out.printf("Medium Grade\t: %d Strawberry\n", sc.getMedium());
		System.out.printf("Low Grade\t: %d Strawberry\n", sc.getLow());
		System.out.printf("Reject\t\t: %d Strawberry\n\n", sc.getReject());;
		System.out.printf("Rejection Ratio\t: %.17f\n", sc.getReject() * 1.0/ sc.getTotalFruit());
		if(sc.getReject() * 1.0/ sc.getTotalFruit() > 0.3)
		{
			System.out.println("Conclusion\t: REJECT\n");
		}
		else
		{
			System.out.println("Conclusion\t: ACCEPT\n");
			sc.set_isAccepted();
		}
    }

        public void countBanana(BananaContainer bc)
        {
		    int i;
            ArrayList<Banana> banana = bc.getBanana();
		    for(i = 0; i < banana.size(); i++)
		    {
			    bc.addTotalFruit();
		    }
        }

        public void gradeBananaContainer(BananaContainer bc)
        {
            int i;
            ArrayList<Banana> banana = bc.getBanana();
            for(i = 0; i < banana.size(); i++)
            {
                if((banana.get(i).getWeight() > 130 && banana.get(i).getWeight() <= 150) && (banana.get(i).getColor().compareTo("YELLOW") == 0 && 
                banana.get(i).getSpeck().compareTo("LOW") == 0))
		        {
			        bc.addHigh();
				    banana.get(i).setGrade("HIGH");
		        }
		        else if((banana.get(i).getWeight() > 130 && banana.get(i).getWeight() <= 150) && (banana.get(i).getColor().compareTo("YELLOW") == 0 && 
                banana.get(i).getSpeck().compareTo("MEDIUM") == 0))
		        {
			        bc.addMedium();
				    banana.get(i).setGrade("MEDIUM");
		        }
		        else if((banana.get(i).getWeight() > 100 && banana.get(i).getWeight() <= 130) && (banana.get(i).getColor().compareTo("YELLOW") == 0 &&
                banana.get(i).getSpeck().compareTo("LOW") == 0))
		        {
			        bc.addMedium();
				    banana.get(i).setGrade("MEDIUM");
		        }
                else if((banana.get(i).getWeight() > 130 && banana.get(i).getWeight() <= 150) && (banana.get(i).getColor().compareTo("YELLOW") == 0 &&
                banana.get(i).getSpeck().compareTo("HIGH") == 0))
		        {
			        bc.addLow();
				    banana.get(i).setGrade("LOW");
		        }
                else if((banana.get(i).getWeight() > 100 && banana.get(i).getWeight() <= 130) && (banana.get(i).getColor().compareTo("YELLOW") == 0 &&
                banana.get(i).getSpeck().compareTo("MEDIUM") == 0))
		        {
			        bc.addLow();
				    banana.get(i).setGrade("LOW");
		        }
                else if(banana.get(i).getWeight() <= 100  && (banana.get(i).getColor().compareTo("YELLOW") == 0 &&
                banana.get(i).getSpeck().compareTo("LOW") == 0))
		        {
			        bc.addLow();
				    banana.get(i).setGrade("LOW");
		        }
                else if(banana.get(i).getWeight() > 150  && banana.get(i).getColor().compareTo("YELLOW") == 0 &&
                ((banana.get(i).getSpeck().compareTo("LOW") == 0) || (banana.get(i).getSpeck().compareTo("MEDIUM") == 0 )))
		        {
			        bc.addLow();
				    banana.get(i).setGrade("LOW");
		        }
		        else
		        {
			        bc.addReject();
				    banana.get(i).setGrade("REJECT");
		        }
            }
        }

        public void showBananaGradingResult(BananaContainer bc)
	    {
		    System.out.println("***GRADING REPORT***");
		    System.out.printf("Container Content : %d Banana\n", bc.getTotalFruit());
		    Date date = new Date();
		    System.out.printf("Grading Time : %s\n\n", date);
		    System.out.println("GRADING Details\n");
		    System.out.printf("High Grade\t: %d Banana\n", bc.getHigh());
		    System.out.printf("Medium Grade\t: %d Banana\n", bc.getMedium());
		    System.out.printf("Low Grade\t: %d Banana\n", bc.getLow());
		    System.out.printf("Reject\t\t: %d Banana\n\n", bc.getReject());;
		    System.out.printf("Rejection Ratio\t: %.17f\n", bc.getReject() * 1.0/ bc.getTotalFruit());
		    if(bc.getReject() * 1.0/ bc.getTotalFruit() > 0.4)
		    {
		    	System.out.println("Conclusion\t: REJECT\n");
		    }
		    else
		    {
		    	System.out.println("Conclusion\t: ACCEPT\n");
		    	bc.set_isAccepted();
		    }
	}
}