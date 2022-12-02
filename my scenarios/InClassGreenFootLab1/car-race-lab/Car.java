import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    String name;
    boolean hasFinished;

    public Car(String a)
    {
        name = a;
        hasFinished = false;
    }
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(Greenfoot.getRandomNumber(10));
    }

    public void winning()
    {
        if ( isAtEdge() && !hasFinished )
        {
            MyWorld mw = (MyWorld)getWorld();
            mw.finishOrder(name);
            hasFinished = true;
        }
    }
}
