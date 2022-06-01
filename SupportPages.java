import greenfoot.*; 


public abstract class SupportPages extends World
{

    public SupportPages()
    {    
        super(900, 500, 1); 
    }
    
    public void menuAparicion(){
         addObject(new MenuButton(),500,350);
    }
}

