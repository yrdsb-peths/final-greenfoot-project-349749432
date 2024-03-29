import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Tim 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Rocket rocket = new Rocket();
        addObject(rocket, 300, 300);
        
    
        Bomb bomb = new Bomb();
        addObject(bomb, 300, 200);
        
        boom();
    }
    
    public void boom()
    { 
            Bomb bomb = new Bomb();
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(600);
            addObject(bomb, x, y);
    }
}
