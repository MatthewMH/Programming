import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        StroberiContainer strobericontainer = new StroberiContainer();
        BananaContainer bananacontainer = new BananaContainer();

        Grader grader = new Grader();

        Sorter sorter = new Sorter();

        HighBananaContainer highbananacontainer= new HighBananaContainer();
        LowBananaContainer lowbananacontainer= new LowBananaContainer();
        MediumBananaContainer mediumbananacontainer= new MediumBananaContainer();
        RejectedBananaContainer rejectedbananacontainer= new RejectedBananaContainer();
        HighStroberiContainer highstrobericontainer= new HighStroberiContainer();
        LowStroberiContainer lowstrobericontainer= new LowStroberiContainer();
        MediumStroberiContainer mediumstrobericontainer= new MediumStroberiContainer();
        RejectedStroberiContainer rejectedstrobericontainer= new RejectedStroberiContainer();

        Scanner input = new Scanner(System.in);
        String line;
        boolean index = false;

        while(input.hasNextLine())
        {
            line = input.nextLine();

			//Jika data hanya berupa keterangan, set index
			//sesuai keterangan lalu lanjutkan membaca baris berikutnya.
			if(line.compareTo("Data Stroberi:") == 0)
			{
				index = true;
				continue;
			}
			else if(line.compareTo("Data Pisang:") == 0)
			{
				index = false;
				continue;
			}

            else if(line.compareTo("") == 0)
            {
                if(index)
                {
                    grader.countStroberi(strobericontainer);
                    grader.gradeStroberiContainer(strobericontainer);
                    grader.showStroberiGradingResult(strobericontainer);
                    sorter.sortStroberiContainer(strobericontainer, highstrobericontainer, lowstrobericontainer, mediumstrobericontainer, rejectedstrobericontainer);
                }
                else
                {
                    grader.countBanana(bananacontainer);
                    grader.gradeBananaContainer(bananacontainer);
                    grader.showBananaGradingResult(bananacontainer);
                    sorter.sortBananaContainer(bananacontainer, highbananacontainer, lowbananacontainer, mediumbananacontainer, rejectedbananacontainer);
                }
                continue;
            }

            if(index)
			{
				Stroberi s = new Stroberi();
				String line_parsed[] = line.split(" ");
				s.setStroberi(Integer.parseInt(line_parsed[0]), line_parsed[1]);
                strobericontainer.addStroberi(s);
			}
            else
            {
                Banana b = new Banana();
				String line_parsed[] = line.split(" ");
				b.setBanana(Integer.parseInt(line_parsed[0]), line_parsed[1], line_parsed[2]);
                bananacontainer.addBanana(b);
            }
        }

        if(index)
        {
            grader.countStroberi(strobericontainer);
            grader.gradeStroberiContainer(strobericontainer);
            grader.showStroberiGradingResult(strobericontainer);
            sorter.sortStroberiContainer(strobericontainer, highstrobericontainer, lowstrobericontainer, mediumstrobericontainer, rejectedstrobericontainer);
        }
        else
        {
            grader.countBanana(bananacontainer);
            grader.gradeBananaContainer(bananacontainer);
            grader.showBananaGradingResult(bananacontainer);
            sorter.sortBananaContainer(bananacontainer, highbananacontainer, lowbananacontainer, mediumbananacontainer, rejectedbananacontainer);
        }
        sorter.showSortingReport(highstrobericontainer, lowstrobericontainer, mediumstrobericontainer, rejectedstrobericontainer, highbananacontainer, lowbananacontainer, mediumbananacontainer, rejectedbananacontainer);
    }
}
