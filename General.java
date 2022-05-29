import greenfoot.*;

public abstract class General extends World
{
    public static Counter humanLifeCount = new Counter("Health: ");
    public static Counter humanPointsCount = new Counter("Points: ");
    public General()
    {    
        super(900, 500, 1); 
        addObject(humanLifeCount, 800, 20);
        addObject(new Heart(), 800, 55);
        humanLifeCount.setValue(15);
        
        addObject(humanPointsCount, 700, 20);
        addObject(new Star(), 700, 55);
        humanPointsCount.setValue(0);
    }
    
    public void NextLevelImplementation()
    {
        addObject(new NextLevel(), 890, 250);
    }
}