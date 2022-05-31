import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Human extends MainCharacter
{
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
    
    private void fall(){//Aumenta la velocidad
        setLocation(getX(), getY() + velocidadIn);
        velocidadIn = velocidadIn + aceleracion;
    }
    
    public void movement(){//Mueve a los lados
        if(Greenfoot.isKeyDown("right")){
            move(4);
        }
        if(Greenfoot.isKeyDown("left")){
            move(-4);
        }
        if(Greenfoot.isKeyDown("space")){
            velocidadIn = alturaSalto;
            fall();
        }
    }
    
    public boolean onBuilding(){//Checa si hay algo debajo de él
        Actor abajo = getOneObjectAtOffset(0, getImage().getHeight()/2, Building.class);//offset es el punto medio del objeto
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
             Greenfoot.setWorld(new WinPage());
        }
    }
}
