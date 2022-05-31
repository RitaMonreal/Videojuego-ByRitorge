import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LoadingPage extends SupportPages
{

    public LoadingPage()
    {    
        prepare();
        menuAparicion();
    }
    
    private void prepare()
    {
        addObject( new Loading(),250,140);
    }
}

