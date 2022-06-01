import greenfoot.*;  

public class Surprise extends Actor
{    
    GifImage evolution = new GifImage("Evolution.gif");
    
    public void act()
    {
        setImage(evolution.getCurrentImage());
    }
}

