import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EvilCharacters extends Actor
{    
    public static final int MOVE_EVIL_CHARACTER = 2;
    public static final int TURN_EVIL_CHARACTER = 180;
    public static final int BOUNCE_TOLERANCE = 5;
    
    public void act()
    {
        move(MOVE_EVIL_CHARACTER);
        changeMovement();
    }
    
     public void changeMovement() {
        World world = getWorld();
        
        if(getX() >= world.getWidth() -BOUNCE_TOLERANCE || getX() <= BOUNCE_TOLERANCE) {
            turn(Greenfoot.getRandomNumber(TURN_EVIL_CHARACTER));
        }
        
        if(getY() >= world.getHeight() - BOUNCE_TOLERANCE || getY() <= BOUNCE_TOLERANCE) {
            turn(Greenfoot.getRandomNumber(TURN_EVIL_CHARACTER));
        }
    }
}
