import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hydrant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hydrant extends Actor
{
    private int keluar = 5;
    /**
     * Act - do whatever the hydrant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-10);
        if (getX() <= keluar)
        {
            getWorld().removeObject(this);
        }
    }
}
