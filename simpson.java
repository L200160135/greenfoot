import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class simpsonss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class simpson extends Actor
{
    private int ySpeed = 0;
    
    private GreenfootImage image1;
    private GreenfootImage image2;
    int timergambar = 0;
    public simpson()
    {
        Greenfoot.isKeyDown("SPACE");
        image1 = new GreenfootImage("simpsons.png");
        image2 = new GreenfootImage("simpsons2.png");
        setImage(image1);

    }

    public void act() 
    {
        int groundLevel = 346;
        boolean onGround = (getY() == groundLevel);
        timergambar++;
        if (getImage() == image1 && timergambar == 7)
        {
            setImage(image1);
            timergambar = 0;
        }
        else if (getImage() == image2 && timergambar == 7)
        {
            setImage(image1);
            timergambar = 0;
        }
       
        if (!onGround) // in middle of jump
        {
            ySpeed++; //add gravity effect
            setLocation(getX(),getY()+ySpeed); //fall (rising slower or fall 
               setImage(image2);
        }
        else // on ground
        {
            if ("space".equals(Greenfoot.getKey())) // jump key detected
            {
                ySpeed = -20; //add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
                Greenfoot.playSound("lompat.wav");
            }
            if (isTouching(hydrant.class))
            {
                Greenfoot.playSound("gameoff.wav");
                Greenfoot.stop();
                setImage(image2);
                getWorld().addObject(new gameoff(),360,175);
                getWorld().removeObject(this);
            }
        }
    }    
}
