import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shield here.
 * 
 * @author (Sean O'Quinn) 
 * @version (1.0)
 */
public class Shield extends Actor
{
    /**
     * Act - do whatever the Shield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+3);
        passed();
    }
    /**
     * Check if the shield has passed through the world. If true, remove shield.
     */
     private void passed()
     {
        if (getY() == 699) 
        {
            getWorld().removeObject(this);
        }
     }
}
