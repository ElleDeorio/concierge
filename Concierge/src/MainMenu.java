import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	public static int input;
	public static int action;
	public static void mainmenu() throws IOException {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to your own personal concierge. Please start by choosing the city you are in.");
		places.array();
		input=userInput.nextInt();
		System.out.println("What would you like to discover?");
		System.out.println("1) The major points- best for first timers");
		System.out.println("2) The hidden secrets");
		System.out.println("3) Best Restaurants");
		action=userInput.nextInt();
		if (input==1 && action ==1)
		{
			majorPoints.cancun();
		}
		if (input==2 && action==1)
		{
			majorPoints.newYork();
		}
		if (input==3 && action==1)
		{
			majorPoints.Florence();
		}
		if (input==4 && action==1)
		{
			majorPoints.London();
		}
}
}
