import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class MainCharacter extends Actor
{

    public void act()
    {
        
    }
    
    public abstract void nextLevel();
    public abstract void movement();//Mueve al personaje
    
    public void gettingPoints(){//Trabaja con los items
        Actor item = getOneIntersectingObject(Items.class);
        if(item != null)
        {
            getWorld().removeObject(item);
            General.humanPointsCount.add(7);
        }
    }
    
    public  void touching(){//Trabaja con los malos
        Actor evil;
        evil = getOneIntersectingObject(EvilCharacters.class);
        if(evil != null){
            removeTouching(EvilCharacters.class);
            General.humanLifeCount.add(-1);//Le resta la vida si toca al coso malo
        }
    }
}