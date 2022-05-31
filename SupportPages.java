import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public abstract class SupportPages extends World
{

    public SupportPages()
    {    
        super(500, 300, 1); 
    }
    
    public void menuAparicion(){
         addObject(new MenuButton(),450,280);
    }
}

