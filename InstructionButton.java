import greenfoot.*;

public class InstructionButton extends Button
{
    public void clicked(){
        Greenfoot.setWorld(new InstructionsPage());
    }
}
