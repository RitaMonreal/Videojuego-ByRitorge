import greenfoot.*; 

public class GameOverPage extends SupportPages
{
    private GreenfootSound gameOverSound = new GreenfootSound("GameOverSound.mp3");

    public GameOverPage()
    {    
        prepare();
        menuAparicion();
    }

    private void prepare()
    {
        addObject(new GameOver(),450,200);
        gameOverSound.play();
        gameOverSound.setVolume(40);
    }
}

