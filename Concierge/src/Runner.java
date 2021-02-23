import java.io.IOException;
import java.util.*;
public class Runner {
	public static void main(String[] args) throws IOException{
		MainMenu.mainmenu();
		Places.array();
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
		if (input==1)
		{
			Restaurants.cancun();
			URL.cancun();
		}
		if (input==2)
		{
			Restaurants.newYork();
			URL.newYork();
		}
		if (input==3)
		{
			Restaurants.Florence();
			URL.Florence();
		}
		if (input==4)
		{
			Restaurants.London();
			URL.London();
		}
		if (input==5)
		{
			Restaurants.Paris();
			URL.Paris();
		}
	
	}
	
}

