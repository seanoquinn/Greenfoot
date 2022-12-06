import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * InvaderDefender is the hero of the game. The defender has the ability to move right and left, 
 * shoot lazers to destroy invaders, and recover shield points. If the invaders collide with the
 * defender, the defenders shield is reduced.
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
        checkShieldCollision();
    }

    /**
     * Check if the "left" or "right" key has been pressed and move
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
     * Check if the "f" key has been pressed. If true, create a lazer.
     */
     private void fire()
     {
        if (Greenfoot.isKeyDown("f") && counter <= 0)
        {
            int x = getX();//gets the x coordinate of the defender and sets it to the new lazer
            int y = getY();//gets the y coordinate of the defender and sets it to the new lazer
            getWorld().addObject(new Lazer(),x, y);
            counter = 15;//resets the counter to avoid multiple lazers being fired for a perceived single key stroke.
            Greenfoot.playSound("shoot.wav");
        }
     }
    /**
     * Check for a collision with an invader. If there is a collision, reduce the shield. Once the shield
     * is depleted, the final collision will end the game.
     */
     private void checkInvaderCollision()
     {
        OuterSpace outerspace = (OuterSpace)getWorld();
        int shieldLevel = outerspace.shieldLevel;
        if (isTouching (Invader.class) && shieldLevel > 0)
        {
            Greenfoot.playSound("hurt.wav");
            removeTouching(Invader.class);
            outerspace.addShield(-25);
        }
        else if (isTouching(Invader.class) && shieldLevel <= 0)
        {
            setImage(image2);
            Greenfoot.playSound("explosion.wav");
            outerspace.lose();  
        }
     }
    /**
     * Check for a collision with a shield. If there is a collision, increase the shield amount.
     */
     private void checkShieldCollision()
     {
        if (isTouching (Shield.class))
        {
            Greenfoot.playSound("shield-up.wav");
            removeTouching(Shield.class);
            OuterSpace outerspace = (OuterSpace)getWorld();
            outerspace.addShield(25);
        }
     }
}
