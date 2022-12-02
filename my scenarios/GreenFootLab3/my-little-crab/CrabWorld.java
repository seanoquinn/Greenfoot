import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    private int worldCount;
    private int timer;

    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);

        worldCount = 0;
        timer = 500;

        Crab myCrab = new Crab();
        addObject(myCrab, 425,442);

        Worm worm = new Worm();
        addObject(worm, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        Worm worm2 = new Worm();
        addObject(worm2, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        Worm worm3 = new Worm();
        addObject(worm3, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        Worm worm4 = new Worm();
        addObject(worm4, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        Worm worm5 = new Worm();
        addObject(worm5, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        Worm worm6 = new Worm();
        addObject(worm6, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        Worm worm7 = new Worm();
        addObject(worm7, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        Worm worm8 = new Worm();
        addObject(worm8, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        Worm worm9 = new Worm();
        addObject(worm9, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        Worm worm10 = new Worm();
        addObject(worm10, Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425));
        //addObjevt(new Work(),Greenfoot.getRandomNumber(425), Greenfoot.getRandomNumber(425))

        Lobster lobster = new Lobster();
        addObject(lobster,388,78);
        Lobster lobster1 = new Lobster();
        addObject(lobster1,97,115);

        addObject(worm,400,300);
    }

    public void act()
    {
        actCount();
        countdown();
        timesOut();
        showText("Time left: " + timer,100,40);
    }

/**
 * Increment per act.
 */   
    public int actCount()
    {
        worldCount = worldCount + 1;
        return worldCount;
    }

/**
 * Decrement per act.
 */   
    public int countdown()
    {
        timer = timer - 1;
        return timer;
    }

/**
 * End the game when time expires.
 */
    public void timesOut()
    {
        if (timer == 0)
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }   
}