import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OuterSpace here.
 * 
 * @author (Sean O'Quinn) 
 * @version (1.0)
 */
public class OuterSpace extends World
{
    public int shieldLevel;
    private int score;
    /**
     * Constructor for objects of class OuterSpace.
     * 
     */
    public OuterSpace()
    {    
        super(900, 700, 1); 
        prepare();
        setPaintOrder(InvaderDefender.class,Lazer.class);
        shieldLevel = 100;
        score = 0;
        showScore();
        showShieldLevel();
    }

    public void act()
    {
       if (Greenfoot.getRandomNumber(175) < 1)
       {
        addObject(new Invader(), Greenfoot.getRandomNumber(870), 52);
       }
       if (Greenfoot.getRandomNumber(1000) < 1)
       {
        addObject(new OneUp(), Greenfoot.getRandomNumber(870), 52);
       }
       win();
       //lose();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {        
        InvaderDefender defender = new InvaderDefender();
        addObject(defender,450,672);
    }
    /**
     * Add points to the score. (Can be negative.)
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
    }
    /**
     * Add shield.
     */
    public void addShield(int shield)
    {
        shieldLevel = shieldLevel + shield;
        showShieldLevel();
    }
    /**
     * Show the score in upper left-hand corner.
     */
    private void showScore()
    {
        showText("Score: " + score, 85, 50);
    }
    /**
     * Show shield remaining in upper right-hand corner.
     */
    private void showShieldLevel()
    {
        showText("Shield: " + shieldLevel, 775, 50);
    }
    /**
     * Win. Play a victory song, display winning text, and stop the game. 
     */
    private void win()
    {
        if (score == 400)
        {
            //Greenfoot.playSound(".wav");
            showText("YOU WIN!",450,350);
            Greenfoot.stop();
        }
    }
    /**
     * Lose. Play a sad song, display losing text, and stop the game.
     */
    public void lose()
    {
        showText("YOU LOSE!",450,350);
        Greenfoot.stop();
        //if (shieldLevel <= 0)//calling this method from the InvaderDefender class
        //{
            //Greenfoot.playSound(".wav");
            //showText("YOU LOSE!",450,350);
            //Greenfoot.stop();
        //}
    }
}
