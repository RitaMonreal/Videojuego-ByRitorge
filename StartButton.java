import greenfoot.*; 

public class StartButton extends Button
{
    
    public void clicked(){
        Greenfoot.setWorld(new InstructionsLevel1Page());
    }
}