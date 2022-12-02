import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GrassyKnoll extends World
{

    /**
     * Constructor for objects of class GrassyKnoll.
     * 
     */
    public GrassyKnoll()
    {    
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //for (int i = 0; i < 12; i = i + 1)
        //{
        //    addObject(new Seed(),i * 50 +25, 350);
        //}

        for (int i = 0; i < 12; i = i + 1)
        {
            addObject(new Flower(),i * 50 +25, 350);
        }
    }
}
