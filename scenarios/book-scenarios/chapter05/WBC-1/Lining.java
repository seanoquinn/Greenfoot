import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lining are objects at the edge of the vein.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Lining extends Actor
{
    /**
     * Moving in the bloodstream.
     */
    public void act() 
    {
        setLocation(getX()-1, getY());
        
        if (getX() == 0) 
        {
            getWorld().removeObject(this);
            //Bloodstream.removeObject(this);
        }
    }    
}
