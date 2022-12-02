import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Seed extends Actor
{
    private int countdown = Greenfoot.getRandomNumber(200) + 100;
    private boolean isSeed = true;
    private boolean isFlower = false;
    private boolean isWilted = false;

    /**
     * Constructor. Nothing to do so far.
     */
    public Seed()
    {
    }
    /**
     * Decrement a counter that will transform the seed object
     * from a seed, to flower, to wilted flower.
     */
    public void act()
    {
        //decrement();
        //tansform();
    }

    public void decrement()
    {
        countdown = countdown - 1;
    }

    public void tansform()
    {
        if (countdown == 0)
        {
            if (isSeed == true)
            {
                setImage("flower.png");
                isSeed = false;
                isFlower = true;
                countdown = Greenfoot.getRandomNumber(200) + 100;
            }
            else if (isFlower == true)
            {
                setImage("wilted.png");
                isFlower = false;
                isWilted = true;
            }
        }
    }
}
