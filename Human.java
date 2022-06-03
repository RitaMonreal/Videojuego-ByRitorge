import greenfoot.*;

public class Human extends MainCharacter
{
    private GreenfootSound itemSound = new GreenfootSound("ItemSound.mp3");
    private GreenfootSound jumpSound = new GreenfootSound("JumpSound.mp3");
    private static final int MOVE = 4;
    private int velocidadIn = 0;
    private int aceleracion = 1;
    private int alturaSalto = -8;
    
    public void act()
    {
        movement();
        checkFalling();
        nextLevel();
        touching();
        gettingPoints();
        stopGame();
    }
    
    private void fall(){
        setLocation(getX(), getY() + velocidadIn);
        velocidadIn = velocidadIn + aceleracion;
    }
    
    public void movement(){
        if(Greenfoot.isKeyDown("right")){
            move(MOVE);
        }
        
        if(Greenfoot.isKeyDown("left")){
            move(-MOVE);
        }
        
        if(Greenfoot.isKeyDown("space")){
            jumpSound.play();
            velocidadIn = alturaSalto;
            fall();
        }
    }
    
    public boolean onBuilding(){
        Actor abajo = getOneObjectAtOffset(0, getImage().getHeight()/2, Building.class);
        return abajo != null;
    }
    
    public void checkFalling(){
        if(onBuilding() == false){
            fall();
        }
        
        if(onBuilding() == true){
            velocidadIn = 0;
        }
    }
    
     public void nextLevel() 
    {
        Actor door = getOneIntersectingObject(NextLevel.class);
        
        if(door != null){
            String name = Greenfoot.ask("Enter your name: ");
            RecordsManager.save(name, General.humanPointsCount.getValue());
             
            Greenfoot.setWorld(new WinPage());
            itemSound.play();
        }
    }
}

