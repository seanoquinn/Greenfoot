import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OneUp here.
 * 
 * @author (Sean O'Quinn) 
 * @version (1.0)
 */
public class OneUp extends Actor
{
    /**
     * Act - do whatever the OneUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+3);
        passed();
    }
    /**
     * When the extra life passes through the game, remove the extra life.
     */
     private void passed()
     {
        if (getY() == 699) 
        {
            getWorld().removeObject(this);
        }
     }
}
