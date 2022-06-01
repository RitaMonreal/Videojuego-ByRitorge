import greenfoot.*;  

public class FinalEdit extends World
{

    public FinalEdit()
    {    
        super(292, 283, 1); 
        prepare();
    }

    private void prepare()
    {
        addObject(new Surprise(),146,141);
        addObject(new MenuButton(),240,260);
    }
}

