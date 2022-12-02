import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Flower extends Actor
{
    private GreenfootImage seedImage;
    private int countdown = Greenfoot.getRandomNumber(200) + 100;
    private boolean isSeed = true;
    private boolean isFlower = false;
    private boolean isWilted = false;

    /**
     * Constructor. Initialize the seed image, and set the image for the flower.
     */
    public Flower()
    {
        seedImage = new GreenfootImage("seed.png");
        setImage(seedImage);
    }

    /**
     * Decrement a counter that will transform the flower object
     * from a seed, to flower, to wilted flower.
     */
    public void act()
    {
        countdown();
        tansform();
    }

    public void countdown()
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
