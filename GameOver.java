import greenfoot.*;

public class GameOver extends Actor
{
    GifImage gameOver = new GifImage("GameOver.gif");
    
    public void act()
    {
        setImage(gameOver.getCurrentImage());
    }
}

