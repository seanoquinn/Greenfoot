import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    String[] carNames = new String[] {"McLaren", "Ferarri", "Porche", "Audi", "Lexus"};

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        //addObject(new Car(),50,80);//create a new object that once initiated, is gone.

        for ( int i = 0;i < 5 ;i++ )
        {
            String name = carNames[i];
            addObject(new Car(name),50, i * 75 + 50);
        }
    }

    public void finishOrder(String s)
    {
        showText(s, 400, 200);
    }
}
