package lambda;

import java.util.Random;

//This is a random player class with two functionalities playGames and playMusic
class RandomPlayer {

	public void playGame(String gameName) throws InterruptedException
    { 
        System.out.println(gameName + " game started");
 
        // Assuming game is being played for 500 milliseconds
        Thread.sleep(500); 
 
        System.out.println(gameName + " game ended");
    }
 
    public void playMusic(String trackName) throws InterruptedException
    {
         System.out.println(trackName + " track started");
 
        // Assuming music is being played for 500 milliseconds
        Thread.sleep(500); 
 
        System.out.println(trackName + " track ended");
    }
}


public class LambdaThread3 {
	
	 // games and tracks arrays which are being used for picking random items
    static String[] games
        = { "COD",      "Prince Of Persia", "GTA-V5",
            "Valorant", "FIFA 22",          "Fortnite" };
    static String[] tracks
        = { "Believer", "Cradles", "Taki Taki", "Sorry",
            "Let Me Love You" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instance of RandomPlayer to access its functionalities
		RandomPlayer player = new RandomPlayer(); 
                       
	    // Random class for choosing random items from above arrays
	    Random random = new Random();
	
	    // Creating two lambda expressions for runnable interfaces
	    Runnable gameRunner = () ->
	    {
	        try {
	        	 // Choosing game track for playing
	            player.playGame(games[random.nextInt(games.length)]); 
	        }
	        catch (InterruptedException e) {
		            e.getMessage();
	        }
	    };
	
	    Runnable musicPlayer = () ->
	    {
	        try {
	        	// Choosing random music track for playing
	            player.playMusic(tracks[random.nextInt(tracks.length)]); 
	        }
	        catch (InterruptedException e) {
		            e.getMessage();
	        }
	    };
	
	    // Instantiating two thread classes with runnable references
	    Thread game = new Thread(gameRunner);
	    Thread music = new Thread(musicPlayer);
	
	    // Starting two different threads
	    game.start();
	    music.start();
	}
}
