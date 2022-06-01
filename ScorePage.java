import greenfoot.*;  

public class ScorePage extends World
{
    public ScorePage()
    {    
        super(900, 500, 1); 
        addObject(new ScoreBoard(800, 450), getWidth() / 2, getHeight() / 2); 
        addObject(new MenuButton(), 800, 475);
    }
}
