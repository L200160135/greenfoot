import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int imageCount = 0;
    private GreenfootImage bgImage = new GreenfootImage("backgorunf.png");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int timer;
    int timerII;
    int timerIII;
    int timerbg1;
    int timerbg2;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super (700, 390, 1); 
        
        addObject(new jalanan(), 353, 381);
        addObject(new Score(),556,30);
        addObject(new hydrant(),1000,360);
        addObject(new simpson(),50,346);
    }
    public void drawBackgroundImage(){
        if (imageCount < -bgImage.getWidth()){
            imageCount += bgImage.getWidth();
        }
        int temp = imageCount;
        getBackground().drawImage(bgImage, temp, 0);
        getBackground().drawImage(bgImage, temp + bgImage.getWidth(), 0);
    }
   public void act()
    {
        imageCount -= 2;
        drawBackgroundImage();
        hydrantRespawn();
        
    }
    public void hydrantRespawn()
    {
       timer++;
       timerII++;
       timerIII++;
       if (timer % 60 == 0)
       {
           addObject(new hydrant(),1000,360);
       }
       if (timerII % 80 == 0)
       {
           addObject(new hydrant(),1000,360);
       }
       
    }
    
 
    
}