import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.List;

public class Level2 extends General
{
    /*
    private static final int WIDTH_FLOOR = 50;
    private static final int HEIGHT_FLOOR = 50;*/
    
    public void NextLevelImplementation(){
        addObject(new NextLevel(), 890, 250);
    }

    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,105,488);
        Ground ground2 = new Ground();
        addObject(ground2,321,488);
        Ground ground3 = new Ground();
        addObject(ground3,536,488);
        Ground ground4 = new Ground();
        addObject(ground4,754,488);
        Ground ground5 = new Ground();
        addObject(ground5,882,488);

        Ground ground7 = new Ground();
        addObject(ground7,420,340);

        Ground ground8 = new Ground();//nivel 1 3
        addObject(ground8,790,420);

        Ground ground9 = new Ground();//Ultimo izquierda
        addObject(ground9,110,170);
        Ground ground11 = new Ground();
        addObject(ground11,315,170);

        Ground ground10 = new Ground();//El que está antes de caer
        addObject(ground10,635,274);

        Ground ground6 = new Ground();
        addObject(ground6,230,386);

        HomoSapines homoSapines = new HomoSapines();
        addObject(homoSapines,50,350);
        Fire fire = new Fire();
        addObject(fire,37,123);
        Fire fire2 = new Fire();
        addObject(fire2,352,447);
        Tool tool = new Tool();
        addObject(tool,158,349);
        Tool tool2 = new Tool();
        addObject(tool2,223,215);
        Tool tool3 = new Tool();
        addObject(tool3,284,349);
        Tool tool4 = new Tool();
        addObject(tool4,235,349);
        Tool tool5 = new Tool();
        addObject(tool5,405,450);
        Tool tool6 = new Tool();
        addObject(tool6,629,448);
        Tool tool7 = new Tool();
        addObject(tool7,94,129);
        Tool tool8 = new Tool();
        addObject(tool8,638,396);
        Tool tool9 = new Tool();
        addObject(tool9,582,449);
        Tool tool10 = new Tool();
        addObject(tool10,587,394);
        Tool tool11 = new Tool();
        addObject(tool11,533,447);
        Tool tool12 = new Tool();
        addObject(tool12,490,400);
        tool12.setLocation(514,389);
        tool12.setLocation(538,388);
        Tool tool13 = new Tool();
        addObject(tool13,470,449);
        Tool tool14 = new Tool();
        addObject(tool14,491,395);
        Tool tool15 = new Tool();
        addObject(tool15,431,395);
        Tool tool16 = new Tool();
        addObject(tool16,200,349);
        Fire fire3 = new Fire();
        addObject(fire3,559,332);
        Tool tool17 = new Tool();
        addObject(tool17,143,135);
        Tool tool18 = new Tool();
        addObject(tool18,193,133);
        Tool tool19 = new Tool();
        addObject(tool19,241,136);
        Fire fire4 = new Fire();
        addObject(fire4,288,128);
    }


    public Level2() 
    {    
        NextLevelImplementation();
        prepare();
    }
  
}