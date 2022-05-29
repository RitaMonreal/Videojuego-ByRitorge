import greenfoot.*;

public class Level2 extends General
{
    public Level2()
    {
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
    public void NextLevelImplementation(){
        addObject(new NextLevel1(), 700, 55);
    }
}

