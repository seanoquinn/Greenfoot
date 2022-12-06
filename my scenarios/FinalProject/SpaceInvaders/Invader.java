import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Invader is the enemy. The invader moves methodically down the game screen. If he
 * reaches the end of the screen, the defenders score is reduced.
 * 
 * @author (Sean O'Quinn) 
 * @version (1.0)
 */
public class Invader extends Actor
{
    /**
     * Act - do whatever the Invader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY()+2);
        passed();

    }
    /**
     * When the invader passes through the game, remove the invader and decrease
     * the player's score.
     */
     private void passed()
     {
        if (getY() == 698) 
        {
            OuterSpace outerspace = (OuterSpace)getWorld();
            outerspace.addScore(-5);
            getWorld().removeObject(this);
        }
     }
}
