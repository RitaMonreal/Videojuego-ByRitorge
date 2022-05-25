import greenfoot.*;

public class Level1 extends World
{
    public Level1()
    {
        super(900, 500, 1); 
        addObject (new CellCharacter(),450,150);
        createVirus(20);
    }
    
    public void createVirus(int quantity) {
        int x, y;
        
        for(int i = 0; i < quantity; i++) {
            VirusCharacter virus = new VirusCharacter();
            x = Greenfoot.getRandomNumber(getWidth());
            y = Greenfoot.getRandomNumber(getHeight());
            addObject(virus, x, y);
        }
    }
}
