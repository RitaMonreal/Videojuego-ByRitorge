import greenfoot.*;  

public class Menu extends World
{
    public Menu()
    {     
        super(900, 500, 1); 
        addObject (new StartButton(),450,150);
        addObject (new ScoreButton(),450,250);
        addObject (new InstructionButton(),450, 350);
    }
}
