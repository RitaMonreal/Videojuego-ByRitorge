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
        Building_3 building_3 = new Building_3();
        addObject(building_3,277,478);
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