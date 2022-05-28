import greenfoot.*;  

public class CellCharacter extends Actor
{    
    private static final int UP = 0;
    private static final int DOWN = 1;
    private static final int LEFT = 2;
    private static final int RIGHT = 3;
    private static final int CHANGE_DIRECTION_UP = 3;
    private static final int CHANGE_DIRECTION_DOWN = 3;
    private static final int CHANGE_DIRECTION_RIGHT = 3;
    private static final int CHANGE_DIRECTION_LEFT = 3;
    private static final int CHANGE_ROTATION_UP = 270;
    private static final int CHANGE_ROTATION_DOWN = 90;
    private static final int CHANGE_ROTATION_RIGHT = 0;
    private static final int CHANGE_ROTATION_LEFT = 180;
    
    public void act()
    {
        moveCell();
        touching();
    }
    
    public void touching()
    {
        Actor virus;
        virus = getOneIntersectingObject(VirusCharacter.class);
        if(virus != null){
            removeTouching(VirusCharacter.class);//Elimina al virus si lo tocas, pero te quita una vida también
            General.humanLifeCount.add(-1);//Le resta la vida si toca al virus 
        }
        
    }
    
    public void moveCell() {
        if(Greenfoot.isKeyDown("UP")) {
            setNewDirection(UP);
        } else if(Greenfoot.isKeyDown("DOWN")) {
            setNewDirection(DOWN);
        } else if(Greenfoot.isKeyDown("RIGHT")) {
            setNewDirection(RIGHT);
        } else if(Greenfoot.isKeyDown("LEFT")) {
            setNewDirection(LEFT);
        }
    }
    
    public void setNewDirection(int direction) {
        switch(direction) {
            case UP:
                setRotation(CHANGE_ROTATION_UP);
                setLocation(getX(), getY()-CHANGE_DIRECTION_UP);
                break;
            case DOWN:
                setRotation(CHANGE_ROTATION_DOWN);
                setLocation(getX(), getY()+CHANGE_DIRECTION_DOWN);
                break;
            case RIGHT:
                setRotation(CHANGE_ROTATION_RIGHT);
                setLocation(getX()+CHANGE_DIRECTION_RIGHT, getY());
                break;
            case LEFT:
                setRotation(CHANGE_ROTATION_LEFT);
                setLocation(getX()-CHANGE_DIRECTION_LEFT, getY());
                break;
        }
    }
}
