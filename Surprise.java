import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Surprise extends Actor
{    
    GifImage evolution = new GifImage("Evolution.gif");
    public void act()
    {
        setImage(evolution.getCurrentImage());
    }
}

