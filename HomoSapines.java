import greenfoot.*;  

public class HomoSapines extends MainCharacter
{
    private GreenfootSound itemSound = new GreenfootSound("ItemSound.mp3");
    private GreenfootSound extraLife = new GreenfootSound("ExtraLife.mp3");
    private static final int CHANGE_DIRECTION = 2;
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
        stopGame();
    }
    
    @Override
    public void touching()
    {
        Actor floor = getOneIntersectingObject(Ground.class);
        
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
            extraLife.play();
            extraLife.setVolume(30);
        }
    }
    
    public void nextLevel() 
    {
        Actor door = getOneIntersectingObject(NextLevel.class);
        
        if(door != null){
             Greenfoot.setWorld(new InstructionsLevel3Page());
             itemSound.play();
        }
    }
    
    public void movement(){
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(),getY() - CHANGE_DIRECTION);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(),getY() + CHANGE_DIRECTION);
        }
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX() - CHANGE_DIRECTION,getY());
        }
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() + CHANGE_DIRECTION,getY());
        }
    }
    
    private void animateOnMove()
    {
        if(getX() != xPos || getY() != yPos) {
            currentImage++;
            
            if(currentImage >= imageNames.length){
                currentImage = 0;
            }
            
            GreenfootImage newImage = new GreenfootImage(imageNames[currentImage]);
            
            if(getX()<xPos) {
                newImage.mirrorHorizontally();
            }
            
            setImage(newImage);
            myImage = getImage();
        }
        
        xPos = getX();
        yPos = getY();
    }
}
