import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines a Lobster. Lobsters eat Crabs.
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turnAtEdge();
        randomTurn();
        move(5);
        lookForCrab();
        center();

    }

/**
 * Check whether we have found a work.
 * If we have, eat it. If not, do nothing.
 */   
    public void lookForCrab()
    {
        if ( isTouching(Crab.class))
        {
            removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }  
    }

/**
 * Genrate a random movement.
 * Get a random number between 0-99 and if less than 10,
 * Then rotate the object 45 degrees in either direction.
 */   
    public void randomTurn()
    {
        if ( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        } 
    }

    public void turnAtEdge()
    {
        if ( isAtEdge() )
        {
            turn(Greenfoot.getRandomNumber(100));
        }
    }

    public void center()
    {
        if ( Greenfoot.getRandomNumber(500) < 25 )
        {
            turnTowards(280,280);
        }
    }
}
