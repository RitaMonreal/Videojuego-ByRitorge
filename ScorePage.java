import greenfoot.*;  
import java.util.List;

public class ScorePage extends World
{
    private static final Color black = new Color(0,0,0,0);
    private GreenfootImage background;
    
    public ScorePage()
    {    
        super(900, 500, 1); 
        GreenfootImage image = new GreenfootImage(background);
        addObject(new MenuButton(), 800, 475);
        showText("SCORE BOARD", 450, 50);
        
        List<GameRecord> records = RecordsManager.getRecords();
        
        for(GameRecord record: records) {
            GreenfootImage text = new GreenfootImage(record.getPlayerName() + record.getScore(), 22, Color.BLACK, black);
            
            if (text.getWidth() > image.getWidth() - 20)
            {
                image.scale(text.getWidth() + 20, image.getHeight());
            }
            
            image.drawImage(text, (image.getWidth()-text.getWidth())/2, (image.getHeight()-text.getHeight())/2);
            setImage(image);
        }
    }
}
