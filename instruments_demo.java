abstract class instruments
{
	abstract void play();
}

class piano extends instruments
{
	void play()
	{
	    System.out.println("piano is palying tan tan tan tan");
	}
}

class flute extends instruments
{
	void play()
	{
	    System.out.println("flute is palying toot toot toot toot");
	}
}

class guitar extends instruments
{
	void play()
	{
	    System.out.println("guitar is palying tin tin tin tin");
	}
}

public class instruments_demo
{
    public static void main(String args[])
    {
       instruments[] instrument=new instruments[10];
        instrument[0]=new piano();
        instrument[1]=new guitar();
        instrument[2]=new flute();
        instrument[3]=new guitar();
        instrument[4]=new flute();
        instrument[5]=new piano();
        instrument[6]=new flute();
        instrument[7]=new guitar();
        instrument[8]=new piano();
        instrument[9]=new flute();
        
        for(int i=0;i<10;i++)
            instrument[i].play();
        
    }
}