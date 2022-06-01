import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StartGame extends Button
{
    private String level;
    
    public StartGame(String level)
    {    
        super(); 
        this.level = level;
    }
    
    public void act (){
        clicked();
    }
    
    public void clicked(){
        
        if(Greenfoot.mouseClicked(this)){
            
            switch(level){
                case "InstructionsLevel1Page":
                    Greenfoot.setWorld(new Level1());
                    break;
                case "InstructionsLevel2Page":
                    Greenfoot.setWorld(new Level2());
                    break;
                case "InstructionsLevel3Page":
                    Greenfoot.setWorld(new Level3());
                    break;
            }
        }
    }
}
