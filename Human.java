import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Human extends MainCharacter
{
    private int jumpHeight = 10;
    private int walkSpeed = 5;
    private double fallSpedd = 0.4;
    
    private boolean inTheAir = false;
    private double deltaX = 0;
    private double deltaY = 0;
    private int groundHeight = getImage().getHeight()/2;
    private int sideWidth = getImage().getWidth()/2;
    private World myWorld;
    int worldHeight;
    int worldWidth;
    
    public void addedToWorld(){
        
    }
    
    public void nextLevel(){
        
    }
    public void gettingPoints(){
        
    }
    public void touching(){
        
    }
    public void act()
    {
        // Add your action code here.
    }
}
