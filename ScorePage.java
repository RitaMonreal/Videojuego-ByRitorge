import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScorePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScorePage extends World
{
    //public static ScoreBoard scoreBoard = new ScoreBoard(450, 250);
    /**
     * Constructor for objects of class ScorePage.
     * 
     */
    public ScorePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        addObject(new ScoreBoard(800, 450), getWidth() / 2, getHeight() / 2); 
        addObject(new MenuButton(), 800, 475);
    }
}
