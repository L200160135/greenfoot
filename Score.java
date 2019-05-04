import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int Score = 0;
    int timerbg1 = 0;
    int timerbg2 = 0;
    Color bg_default =Color.BLUE;
    Color font_default =Color.BLACK;
    public void act() 
    {
        // Add your action code here.
        CountScore1();
       
    } 
    
    public void CountScore1()
    {
        Score++;
        timerbg1++;
        timerbg2++;
        if (timerbg1 == 1000)
        {
            font_default = Color.WHITE;
            bg_default = Color.BLUE;
            timerbg1 =0;
        }
        if (timerbg2 == 2000)
        {
            font_default = Color.BLACK;
            bg_default = Color.BLUE;
            timerbg2 =0;
        }
        setImage(new GreenfootImage("  Score :  " + Score, 25, font_default, bg_default  )); 
    }
      
}

