import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        if ( isAtEdge() )
        {
            turn(Greenfoot.getRandomNumber(100));
        }
        if ( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(45);
        }
        move(5);
    }
}