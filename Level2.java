import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.List;

public class Level2 extends General
{
    public Level2() 
    {    
        NextLevelImplementation();
        prepare();
    }
    
    public void NextLevelImplementation(){
        addObject(new NextLevel(), 890, 250);
    }

    private void prepare()
    {
        addObject(new Ground(),105,488);
        addObject(new Ground(),321,488);
        addObject(new Ground(),536,488);
        addObject(new Ground(),754,488);
        addObject(new Ground(),882,488);
        addObject(new Ground(),420,340);
        addObject(new Ground(),790,420);//nivel 1 3
        addObject(new Ground(),110,170);//Ultimo izquierda
        addObject(new Ground(),315,170);
        addObject(new Ground(),635,274);//El que está antes de caer
        addObject(new Ground(),230,386);
        addObject(new HomoSapines(),50,350);
       
        addObject(new Fire(),37,123);
        addObject(new Fire(),352,447);
        addObject(new Fire(),559,332);
        addObject(new Fire(),288,128);
        
        addObject(new Tool(),158,349);
        addObject(new Tool(),223,215);
        addObject(new Tool(),284,349);
        addObject(new Tool(),235,349);
        addObject(new Tool(),405,450);
        addObject(new Tool(),629,448);
        addObject(new Tool(),94,129);
        addObject(new Tool(),638,396);
        addObject(new Tool(),582,449);
        addObject(new Tool(),587,394);
        addObject(new Tool(),533,447);
        addObject(new Tool(),470,449);
        addObject(new Tool(),491,395);
        addObject(new Tool(),431,395);
        addObject(new Tool(),200,349);
        addObject(new Tool(),143,135);
        addObject(new Tool(),193,133);
        addObject(new Tool(),241,136);
    }
}


