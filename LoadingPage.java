import greenfoot.*; 

public class LoadingPage extends SupportPages
{
    private GreenfootSound loadingSound = new GreenfootSound("LoadingSound.mp3");

    public LoadingPage()
    {    
        prepare();
        menuAparicion();
    }
    
    private void prepare()
    {
        addObject( new Loading(),250,140);
    }
    
    public void act() {
        loadingSound.play();
        loadingSound.setVolume(20);
    }
}


  
