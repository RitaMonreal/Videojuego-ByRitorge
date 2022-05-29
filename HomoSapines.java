import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomoSapines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomoSapines extends MainCharacter
{
    private GreenfootImage myImage = getImage();
    private String[] imageNames = {"Simio_1.png", "Simio_2.png","Simio_3.png", "Simio_4.png"};
    private int currentImage = 0;
    int xPos;
    int yPos;
    
    public void addedToWorld(World level2){
        xPos = getX();
        yPos = getY();
    }
    
    public void touching()
    {
        Actor floor;
        floor = getOneIntersectingObject(Ground.class);
        if(floor != null){
            General.humanLifeCount.add(-1);//Le resta la vida si toca al virus 
        }
    }
    
    public void gettingPoints(){
        Actor fire = getOneIntersectingObject(Fire.class);
        Actor tool = getOneIntersectingObject(Tool.class);
        if(fire != null)
        {
            getWorld().removeObject(fire);
            General.humanLifeCount.add(5);
        }
        
        if(tool != null)
        {
            getWorld().removeObject(tool);
            General.humanPointsCount.add(10);
        }
    }
    
    public void nextLevel() 
    {
        Actor door = getOneIntersectingObject(NextLevel.class);
        if(door != null){
             Greenfoot.setWorld(new Level3());
        }
    }
        
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
        }
        animateOnMove();
        nextLevel();
        touching();
        gettingPoints();
    }
    private void animateOnMove()
    {
        if(getX()!=xPos||getY()!=yPos)
        {
            currentImage++;
            if(currentImage >= imageNames.length){
                currentImage = 0;
            }
            
            GreenfootImage newImage = new GreenfootImage(imageNames[currentImage]);
            
            if(getX()<xPos)
            {
                newImage.mirrorHorizontally();
            }
            
            setImage(newImage);
            myImage = getImage();
        }
        xPos = getX();
        yPos = getY();
    }
}
