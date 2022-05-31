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
        Building_1 building_1 = new Building_1();
        addObject(building_1,62,370);

        Building_2 building_2 = new Building_2();
        addObject(building_2,170,411);

        Building_1 building_12 = new Building_1();
        addObject(building_12,492,371);

        Building_2 building_22 = new Building_2();
        addObject(building_22,600,413);

        Building_1 building_13 = new Building_1();
        addObject(building_13,705,493);

        Building_2 building_23 = new Building_2();
        addObject(building_23,809,412);

        Human human = new Human();
        addObject(human,27,189);
        
        Book book = new Book();
        addObject(book,451,224);
        
        Book book2 = new Book();
        addObject(book2,573,305);
        
        Book book3 = new Book();
        addObject(book3,661,345);
        
        Brain brain = new Brain();
        addObject(brain,706,346);
        
        Brain brain2 = new Brain();
        addObject(brain2,745,344);
        
        Brain brain3 = new Brain();
        addObject(brain3,495,228);
        
        Brain brain4 = new Brain();
        addObject(brain4,141,309);
        
        Book book4 = new Book();
        addObject(book4,196,303);

        Book book5 = new Book();
        addObject(book5,611,307);
        
        Brain brain5 = new Brain();
        addObject(brain5,406,61);
        
        Book book6 = new Book();
        addObject(book6,254,38);
        
        Brain brain6 = new Brain();
        addObject(brain6,639,43);
        
        Brain brain7 = new Brain();
        addObject(brain7,249,478);
        
        Book book7 = new Book();
        addObject(book7,250,433);
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