import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lazer here.
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
     * Check is the lazer has collided with an invader. If yes, remove invader.
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
     * Check is the lazer has pass through the world. If yes, remove lazer.
     */
    private void passed()
    {
        if (getY() == 0) 
        {
            getWorld().removeObject(this);
        }
    }
}
