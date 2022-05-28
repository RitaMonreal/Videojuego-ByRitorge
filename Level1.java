import greenfoot.*;

public class Level1 extends General
{
    public Level1()
    {
        addObject (new CellCharacter(),450,150);
        createVirus(20);        
        prepare();
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
