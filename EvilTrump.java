import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilTrump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilTrump extends Actor
{
    private static final int MOVE_EVIL_TRUMP = 2;
    private static final int TURN_EVIL_TRUMP = 180;
    private static final int BOUNCE_TOLERANCE = 5;
    
    public void act()
    {
        move(MOVE_EVIL_TRUMP);
        changeMovement();
    }
    
    public void changeMovement() {
        World world = getWorld();
        
        if(getX() >= world.getWidth() -BOUNCE_TOLERANCE || getX() <= BOUNCE_TOLERANCE) {
            turn(Greenfoot.getRandomNumber(TURN_EVIL_TRUMP));
        }
        
        if(getY() >= world.getHeight() - BOUNCE_TOLERANCE || getY() <= BOUNCE_TOLERANCE) {
            turn(Greenfoot.getRandomNumber(TURN_EVIL_TRUMP));
        }
    }
}
