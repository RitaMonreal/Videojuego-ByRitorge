import greenfoot.*;

public class VirusCharacter extends Actor
{
    private static final int MOVE_VIRUS_CHARACTER = 2;
    private static final int TURN_VIRUS_CHARACTER = 180;
    private static final int BOUNCE_TOLERANCE = 5;
    
    public void act()
    {
        move(MOVE_VIRUS_CHARACTER);
        changeMovement();
    }
    
 
    public void changeMovement() {
        World world = getWorld();
        
        if(getX() >= world.getWidth() -BOUNCE_TOLERANCE || getX() <= BOUNCE_TOLERANCE) {
            turn(Greenfoot.getRandomNumber(TURN_VIRUS_CHARACTER));
        }
        
        if(getY() >= world.getHeight() - BOUNCE_TOLERANCE || getY() <= BOUNCE_TOLERANCE) {
            turn(Greenfoot.getRandomNumber(TURN_VIRUS_CHARACTER));
        }
    }
}
