import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HomoSapines extends MainCharacter
{
    private GreenfootImage myImage = getImage();
    private String[] imageNames = {"Simio_1.png", "Simio_2.png","Simio_3.png", "Simio_4.png"};
    private int currentImage = 0;
    int xPos;
    int yPos;
    
    public void act()
    {
        movement();
        animateOnMove();
        nextLevel();
        gettingLifes();
        touching();
        gettingPoints();
    }
    
    @Override
    public void touching()
    {
        Actor floor;
        floor = getOneIntersectingObject(Ground.class);
        if(floor != null){
            General.humanLifeCount.add(-1);
        }
    }
    
    public void addedToWorld(World level2){
        xPos = getX();
        yPos = getY();
    }
    
    public void gettingLifes(){
        Actor fire = getOneIntersectingObject(Fire.class);
        if(fire != null)
        {
            getWorld().removeObject(fire);
            General.humanLifeCount.add(5);
        }
    }
    
    public void nextLevel() 
    {
        Actor door = getOneIntersectingObject(NextLevel.class);
        if(door != null){
             Greenfoot.setWorld(new Level3());
        }
    }
        
    public void movement(){
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