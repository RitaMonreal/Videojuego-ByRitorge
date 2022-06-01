import greenfoot.*;

public class Level1 extends General
{
    public Level1()
    {
        NextLevelImplementation();
        addObject (new CellCharacter(),getWidth()/2,getHeight()/2);
        createVirus(15);        
        prepare();
    }
        
    public void NextLevelImplementation(){
        addObject(new NextLevel(), 890, 250);
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
    
    private void prepare()
    {
        addObject(new Donut(),109,64);
        addObject(new Donut(),206,380);
        addObject(new Donut(),544,447);
        addObject(new Donut(),458,268);
        addObject(new Donut(),864,80);
        addObject(new Donut(),860,477);
        addObject(new Donut(),30,290);
    }
}
