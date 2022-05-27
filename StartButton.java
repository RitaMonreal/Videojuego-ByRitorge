import greenfoot.*; 

public class StartButton extends Button
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Level1());
        }
    }
}
