import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    private int crabCount;

    /**
     * Create a crab and initialize its two images.
     */
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage(image1);
        wormsEaten = 0;
        crabCount = 0;
    }

    public void act()
    {
        checkKeyPressLR();
        move(5);
        lookForWorm();
        switchImage();
        actCount();
        //checkKeyPressUD();
        //turnAtEdge();
        //randomTurn();
        //anyWormsLeft();
    }

/**
 * Set Image.
 * If true, . If false, .
 */  
public void switchImage()
{
    if (getImage() == image1)
    {
        setImage(image2);
    }
    else
    {
        setImage(image1);
    }
}

/**
 * Check whether the left or right key is depressed.
 * If true, turn. If false, do nothing.
 */  
public void checkKeyPressLR()
{
    if (Greenfoot.isKeyDown("left"))
    {
        turn(-4);
    }
    if (Greenfoot.isKeyDown("right"))
    {
        turn(4);
    }
}

/**
 * Check whether the up or down key is depressed.
 * If true, turn. If false, do nothing.
 */  
public void checkKeyPressUD()
{
    if (Greenfoot.isKeyDown("up"))
    {
        move(-5);
    }
    if (Greenfoot.isKeyDown("down"))
    {
        move(5);
    }
}

/**
 * Check whether we have found a worm.
 * If we have, eat it. If not, do nothing.
 */   
    public void lookForWorm()
    {
        if ( isTouching(Worm.class))
        {
            wormsEaten = wormsEaten + 1;
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");

            if (wormsEaten == 8)
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }

    }

/**
 * Increment per act.
 */   
    public int actCount()
    {
        crabCount = crabCount + 1;
        return crabCount;
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

/**
 * Check for contact with the game edge.
 * If the object is at the edge,
 * Then turn the object a random number between 0-99.
 */  
    public void turnAtEdge()
    {
        if ( isAtEdge() )
        {
            turn(Greenfoot.getRandomNumber(100));
        }
    }

/**
 * Check for the existence of worms.
 * If they are gone, stop.
 */   
   // public void anyWormsLeft()
   // {
   //     if (Greenfoot.getObjects(Worm.class) == false)
   //     {
   //         Greenfoot.stop();
   //     }  
   // }
}