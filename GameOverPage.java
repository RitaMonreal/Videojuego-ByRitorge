import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOverPage extends SupportPages
{

    public GameOverPage()
    {    
        prepare();
        menuAparicion();
    }

    private void prepare()
    {
        addObject(new GameOver(),450,200);
    }
}

