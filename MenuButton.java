import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MenuButton extends Button
{
    public void clicked(){
        Greenfoot.setWorld(new Menu());
    }
}

