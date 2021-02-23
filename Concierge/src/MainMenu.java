import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	public static int input;
	public static int action;
	public static void mainmenu() throws IOException {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to your own personal concierge. Please start by choosing what you are looking for.");
		System.out.println("What would you like to discover?");
		System.out.println("1) The major points- best for first timers");
		System.out.println("2) The hidden secrets");
		System.out.println("3) Best Restaurants");
		action=userInput.nextInt();
		Places.array();
		input=userInput.nextInt();
		
		if (action==1)
		{
			if (input==1)
			{
				MajorPoints.cancun();
			}
			if (input==2)
			{
				MajorPoints.newYork();
			}
			if (input==3)
			{
				MajorPoints.Florence();
			}
			if (input==4)
			{
				MajorPoints.London();
			}
			if (input==5)
			{
				MajorPoints.Paris();
			}
		}
		if (action==2)
		{
			if (input==1)
			{
				HiddenPlaces.cancun();
			}
			if (input==2)
			{
				HiddenPlaces.newYork();
			}
			if (input==3)
			{
				HiddenPlaces.Florence();
			}
			if (input==4)
			{
				HiddenPlaces.London();
			}
			if (input==5)
			{
				HiddenPlaces.Paris();
			}
			else 
			{
				
			}
				
		
		
}
}
}
