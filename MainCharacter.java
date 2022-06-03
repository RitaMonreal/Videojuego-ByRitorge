import greenfoot.*;

public abstract class MainCharacter extends Actor
{
    private GreenfootSound itemSound = new GreenfootSound("ItemSound.mp3");
    private GreenfootSound deathSound = new GreenfootSound("DeathSound.mp3");
    
    public abstract void nextLevel();
    
    public abstract void movement();
    
    public void gettingPoints(){
        Actor item = getOneIntersectingObject(Items.class);
        
        if(item != null)
        {
            getWorld().removeObject(item);
            General.humanPointsCount.add(7);
            itemSound.play();
        }
    }
    
     public void stopGame(){
        if (General.humanLifeCount.getValue() <= 0){
            deathSound.play();
            deathSound.setVolume(20);
            
            String name = Greenfoot.ask("Enter your name: ");
            RecordsManager.save(name, General.humanPointsCount.getValue());
            
            Greenfoot.setWorld(new GameOverPage());
        }
    }
    
    public  void touching(){
        Actor evil = getOneIntersectingObject(EvilCharacters.class);
        
        if(evil != null){
            removeTouching(EvilCharacters.class);
            General.humanLifeCount.add(-1);
        }
    }
}
