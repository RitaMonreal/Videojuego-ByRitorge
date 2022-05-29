import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HomoSapines here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomoSapines extends Actor
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
        
    public void act()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+5);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5,getY());
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5,getY());
        }
        animateOnMove();
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
