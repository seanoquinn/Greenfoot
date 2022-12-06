import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lazer destroys an invader. If the lazer misses its target, then it continues until reaching 
 * the end of the screen.
 * 
 * @author (Sean O'Quinn) 
 * @version (1.0)
 */
public class Lazer extends Actor
{
    /**
     * Act - do whatever the lazer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()-4);
        checkInvaderCollision();
    }
    /**
     * Check is the lazer has collided with an invader. If true, remove invader.
     */
    private void checkInvaderCollision()
    {
        if (isTouching(Invader.class))
        {
            Greenfoot.playSound("invaderkilled.wav");
            removeTouching(Invader.class);
            OuterSpace outerspace = (OuterSpace)getWorld();
            outerspace.addScore(20);
            getWorld().removeObject(this);
        }
        else if (getY() == 0)
        {
            getWorld().removeObject(this);
        }
    }
    /**
     * Check is the lazer has passed through the world. If true, remove lazer.
     */
    private void passed()
    {
        if (getY() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
}
