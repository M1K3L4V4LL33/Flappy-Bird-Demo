import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pipe extends Actor
{
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation( getX() - 2, getY() );
<<<<<<< HEAD
=======
        
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
        if( getX() <= 5 )
        {
            getWorld().removeObject(this);
        }
    }    
}
