import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.List;

public class Level2 extends General
{
    private final int WORLDWIDTH = getWidth();
    private final int WORLDHEIGHT = getHeight();
    
    Floor floorTemplate = new Floor();
    GreenfootImage frImg = floorTemplate.getImage();
    private final int FLOORHEIGHT = frImg.getHeight();
    private final int FLOORWIDTH = frImg.getWidth();
    
    private final int MAPWIDTH = (int) (WORLDWIDTH/FLOORWIDTH);
    private final int MAPHEIGHT = (int) (WORLDHEIGHT/FLOORHEIGHT);
    
    private final String FILENAME = "HumanWorldLevel2.txt";
    private final String FLOORMARKER = "X";
    private final String FIREMARKER = "F";
    private final String TOOLMARKER = "T";
    String[][] mapArray = new String[MAPHEIGHT][MAPWIDTH];
    
   
    
    public Level2() throws IOException
    {    
        mapArray = readMap(MAPWIDTH, MAPHEIGHT, FILENAME);
        drawFloorMap(FLOORWIDTH, FLOORHEIGHT, FLOORMARKER, FIREMARKER, TOOLMARKER, mapArray);
        NextLevelImplementation();
    }
    
    public void drawFloorMap (int floorWidth, int floorHeight, String floorMarker, String fireMarker, String toolMarker, String[][] mapArray)
    {
        int x=0;
        int y=0;
        
        for(y=0; y<mapArray.length; y++)
        {
            for(x=0; x<mapArray[y].length; x++)
            {
                if(mapArray[y][x].equals(floorMarker))
                {
                    int floorX = x*floorWidth + floorWidth/2;
                    int floorY = y*floorHeight + floorHeight/2;
                    addObject(new Floor(), floorX, floorY);
                } else if(mapArray[y][x].equals(fireMarker))
                {
                    int fireX = x*floorWidth + floorWidth/2;
                    int fireY = y*floorHeight + floorHeight/2;
                    addObject(new Fire(), fireX, fireY);
                } else if(mapArray[y][x].equals(toolMarker))
                {
                    int toolX = x*floorWidth + floorWidth/2;
                    int toolY = y*floorHeight + floorHeight/2;
                    addObject(new Tool(), toolX, toolY);
                }  
            }
        }
    }
    
    public String[][] readMap(int mapWidth, int mapHeight, String fileName) throws IOException  //possible problems with the file
    {
        BufferedReader br = null;  //Read one line at a time
        String [][] mArray = new String [mapHeight][mapWidth];  //become the mapArray
        try{
            br = new BufferedReader(new FileReader(fileName));
            String l; //Represent he line that we are reading at a particular time
            int mapRow = 0;  //Tell us the row we are on
            while((l=br.readLine())!=null)
            {
                mArray[mapRow] = l.split(""); //split into each character
                mapRow++;
            }
        } finally {
            if(br!=null)
                br.close();
        }
        return mArray;
    }
    
}

