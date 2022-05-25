import greenfoot.*;  

public class CellCharacter extends Actor
{    
    private static final int UP = 0;
    private static final int DOWN = 1;
    private static final int LEFT = 2;
    private static final int RIGHT = 3;
    
    public void act()
    {
        moveCell();
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
                setRotation(270);
                setLocation(getX(), getY()-1);
                break;
            case DOWN:
                setRotation(90);
                setLocation(getX(), getY()+1);
                break;
            case RIGHT:
                setRotation(0);
                setLocation(getX()+1, getY());
                break;
            case LEFT:
                setRotation(180);
                setLocation(getX()-1, getY());
                break;
        }
    }
}
