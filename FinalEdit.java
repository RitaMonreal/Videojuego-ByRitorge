import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FinalEdit extends World
{

    public FinalEdit()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(292, 283, 1); 
        prepare();
    }

    private void prepare()
    {
        addObject(new Surprise(),146,141);
        addObject(new MenuButton(),240,260);
    }
}
