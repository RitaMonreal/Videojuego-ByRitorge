import greenfoot.*;

public abstract class General extends World
{
    public static Counter humanLifeCount = new Counter();
    public General()
    {    
        super(900, 500, 1); 
        addObject(humanLifeCount, 800, 20);
        addObject(new Heart(), 800, 55);
        humanLifeCount.setValue(50);
    }
}
