import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //move(25);
        //turn(10);

        //if (isAtEdge())
        //{
        //    turn(5);
        //}
        if (Greenfoot.isKeyDown("RIGHT"))
        {
            turn(5);
        }
        if (Greenfoot.isKeyDown("LEFT"))
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("UP"))
        {
            move(5);
        }
        if (Greenfoot.isKeyDown("DOWN"))
        {
            move(-5);
        }
    }
}
