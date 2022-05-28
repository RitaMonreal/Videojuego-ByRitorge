import greenfoot.*;

public class Level1 extends General
{
    public Level1()
    {
        addObject (new CellCharacter(),450,150);
        createVirus(15);        
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
        Donut donut = new Donut();
        addObject(donut,109,64);
        Donut donut2 = new Donut();
        addObject(donut2,206,380);
        Donut donut3 = new Donut();
        addObject(donut3,656,164);
        Donut donut4 = new Donut();
        addObject(donut4,544,447);
        Donut donut5 = new Donut();
        addObject(donut5,458,268);
        Donut donut6 = new Donut();
        addObject(donut6,833,413);
        removeObject(donut6);
        donut3.setLocation(658,164);
        removeObject(donut3);
        Donut donut7 = new Donut();
        addObject(donut7,864,80);
        Donut donut8 = new Donut();
        addObject(donut8,860,477);
        Donut donut9 = new Donut();
        addObject(donut9,30,290);
    }
}
