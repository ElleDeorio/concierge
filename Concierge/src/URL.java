import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class URL extends Restaurants{
	public static void cancun() throws IOException {
	String url = "https://oasishoteles.com/es/restaurantes/benazuza";{

    if(Desktop.isDesktopSupported()){
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            // TODO Auto-generated catch block
           System.out.println("Could not find url");
        }
    }
}
}
	public static void newYork() throws IOException{
		String url = "https://ilovebuvette.com";{

		    if(Desktop.isDesktopSupported()){
		        Desktop desktop = Desktop.getDesktop();
		        try {
		            desktop.browse(new URI(url));
		        } catch (IOException | URISyntaxException e) {
		            // TODO Auto-generated catch block
		           System.out.println("Could not find url");
		        }
		    }
	}
	}
	
		public static void Florence() throws IOException{
			String url = "http://www.vinodaburde.com";{

			    if(Desktop.isDesktopSupported()){
			        Desktop desktop = Desktop.getDesktop();
			        try {
			            desktop.browse(new URI(url));
			        } catch (IOException | URISyntaxException e) {
			            // TODO Auto-generated catch block
			           System.out.println("Could not find url");	
}
}
}
		}
		public static void London() throws IOException{
			String url = "https://thecloveclub.com";{

			    if(Desktop.isDesktopSupported()){
			        Desktop desktop = Desktop.getDesktop();
			        try {
			            desktop.browse(new URI(url));
			        } catch (IOException | URISyntaxException e) {
			            // TODO Auto-generated catch block
			           System.out.println("Could not find url");	
	
}
 }
			}
		}
		public static void Paris() throws IOException{
			String url = "http://www.septime-charonne.fr";{

			    if(Desktop.isDesktopSupported()){
			        Desktop desktop = Desktop.getDesktop();
			        try {
			            desktop.browse(new URI(url));
			        } catch (IOException | URISyntaxException e) {
			            // TODO Auto-generated catch block
			           System.out.println("Could not find url");	
			        }
			    }
			}
		}
}
