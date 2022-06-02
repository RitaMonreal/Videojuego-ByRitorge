import greenfoot.*;  

public class WinPage extends SupportPages
{
    private GreenfootSound victorySound = new GreenfootSound("VictorySound.mp3");

    public WinPage()
    {    
        addObject(new Next(),442,264);   
        victorySound.play();
        victorySound.setVolume(40);
    }
}

