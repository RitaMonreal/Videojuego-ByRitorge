import greenfoot.*;  

public class Level3 extends General
{
    public Level3()
    {    
        NextLevelImplementation();
        prepare();
        createTrump(10); 
    }

    public void NextLevelImplementation(){
        addObject(new NextLevel(), 890, 250);
    }
    
    private void prepare()
    {
        addObject(new Building_1(),62,370);
        addObject(new Building_2(),170,411);
        addObject(new Building_1(),492,371);
        addObject(new Building_2(),600,413);
        addObject(new Building_1(),705,493);
        addObject(new Building_2(),809,412);

        addObject(new Human(),27,189);
        
        addObject(new Book(),451,224);
        addObject(new Book(),573,305);
        addObject(new Book(),661,345);
        addObject(new Book(),250,433);
        addObject(new Book(),196,303);
        addObject(new Book(),611,307);
        addObject(new Book(),254,38);
    
        addObject(new Brain(),706,346);
        addObject(new Brain(),745,344);
        addObject(new Brain(),495,228);
        addObject(new Brain(),141,309);
        addObject(new Brain(),406,61);
        addObject(new Brain(),639,43);
        addObject(new Brain(),249,478);     
    }
    
    public void createTrump(int quantity) {
        int x, y;

        for(int i = 0; i < quantity; i++) {
            EvilTrump trump = new EvilTrump();
            x = Greenfoot.getRandomNumber(getWidth());
            y = Greenfoot.getRandomNumber(getHeight());
            addObject(trump, x, y);
        }
    }
}
