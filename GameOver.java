import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends Actor
{
    GifImage gameOver = new GifImage("GameOver.gif");
    public void act()
    {
        setImage(gameOver.getCurrentImage());
    }
}
