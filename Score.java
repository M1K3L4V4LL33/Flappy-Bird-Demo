import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
<<<<<<< HEAD
import java.awt.Color; 
=======
import java.awt.Color;
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score;
    private String name;
    private boolean scoreChanged;
<<<<<<< HEAD
    /**
     * Score is the constructor of objects type Score
     * 
     * @param No parameters
     * @return 
=======
    
    /**
     * Score is the constructor of objects of type Score
     * 
     * @param There are no parameters
     * @return an object of type Score
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     */
    public Score()
    {
        GreenfootImage scoreImage;
        
        score = 0;
        name = "";
        scoreChanged = false;
        
        scoreImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
        setImage( scoreImage );
    }
    
<<<<<<< HEAD
     /**
=======
    /**
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * act is the code that is run on each iteration of the act cycle
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void act() 
    {
        // Add your action code here.
        if( scoreChanged == true )
        {
            display();
        }
<<<<<<< HEAD
    }
    /**
     * countScore Increase the score
=======
    } 
    
    /**
     * countScore increases the score
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void countScore()
    {
        score++;
        scoreChanged = true;
    }
    
<<<<<<< HEAD
    
    /**
     *setPlayerName changes the name displayed on the leaderboard
     *
     *@param playername is the new players name 
     *@return Nothing is returned
=======
    /**
     * setPlayerName changes the name displayed on the leaderboard
     * 
     * @param playerName is the new player's name
     * @return Nothing is returned
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     */
    public void setPlayerName( String playerName )
    {
        name = playerName;
        scoreChanged = true;
    }
<<<<<<< HEAD
=======
    
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
    /**
     * getScore gets the current score for the player
     * 
     * @param There are no parameters
<<<<<<< HEAD
     * @return an integer rep.the players score
=======
     * @return an integer representing the player's score
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     */
    public int getScore()
    {
        return score;
<<<<<<< HEAD
        
    }
    /**
     * display Displays the scoreboard image
     * 
     * @param No parameters
=======
    }
    
    /**
     * display displays the Scoreboard's image
     * 
     * @param There are no parameters
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
     * @return Nothing is returned
     */
    private void display()
    {
<<<<<<< HEAD
         GreenfootImage newImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
         setImage( newImage );
         scoreChanged = false;
    }
    
    
=======
        GreenfootImage newImage = new GreenfootImage( String.format("Name:%15s %5s Score:%12d", name, "", score), 30, Color.BLACK, Color.WHITE );
        setImage( newImage );
        scoreChanged = false;
    }
    
    
    
    
    
    
    
    
    
    
>>>>>>> 4a003a755ada0e3cc9f13300555f27091d7aad72
}
