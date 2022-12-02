import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvaderDefender here.
 * 
 * @author (Sean O'Quinn) 
 * @version (1.0)
 */
public class InvaderDefender extends Actor
{
    int counter = 0;//variable used to limit the number of lazer objects per percieved key stroke.
    private GreenfootImage image1;
    private GreenfootImage image2;
    /**
     * Create a defender and initialize its two images.
     */
    public InvaderDefender()
    {
        image1 = new GreenfootImage("Invader-Ship.png");
        image2 = new GreenfootImage("explosion.png");
    }
    /**
     * Act - do whatever the InvaderDefender wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        counter = counter - 1;
        checkKeyPressLR();
        fire();
        checkInvaderCollision();
        checkLifeCollision();
    }

    /**
     * Check whether the "left" or "right" key has been pressed and move
     * right or left if true.
     */
    private void checkKeyPressLR()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+6, getY());
        }

        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-6, getY());
        }
    }
    /**
     * Check whether the "f" key has been pressed and create a lazer if true.
     */
     private void fire()
     {
        if (Greenfoot.isKeyDown("f") && counter <= 0)
        {
            int x = getX();
            int y = getY();
            getWorld().addObject(new Lazer(),x, y);
            counter = 15;//resets the counter to avoid multiple lazers being fired for a perceived single key stroke.
            Greenfoot.playSound("shoot.wav");
        }
     }
    /**
     * Check for a collision with an invader. If there is a collision, explode,
     * and remove a life.
     */
     private void checkInvaderCollision()
     {
        if (isTouching (Invader.class))
        {
            setImage(image2);
            Greenfoot.playSound("explosion.wav");
            //Greenfoot.stop(); //moved this stop to OuterSpace.lose
            OuterSpace outerspace = (OuterSpace)getWorld();
            outerspace.addShield(-25);
        }
     }
    /**
     * Check for a collision with an extra life. If there is a collision, add
     * a life.
     */
     private void checkLifeCollision()
     {
        if (isTouching (OneUp.class))
        {
            //Greenfoot.playSound(".wav");
            removeTouching(OneUp.class);
            OuterSpace outerspace = (OuterSpace)getWorld();
            outerspace.addShield(1);
        }
     }
}
