import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MajorPoints extends JFrame{
	public static void cancun() throws IOException{
		ImageIcon cancun= new ImageIcon(("cancun.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, "1. Go visit the Hotel Zone \n 2. Visit downtown \n 3. Go swimming in Cenotes.","CANCUN",
				JOptionPane.CANCEL_OPTION,cancun);
		
	}
	public static void newYork() throws IOException{
		ImageIcon newYork= new ImageIcon(("newYork.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, "1. Go visit Central Park  \n 2. Times Square \n 3. Go to the top of the Empire State Building.","NEW YORK CITY",
				JOptionPane.CANCEL_OPTION,newYork);
	}
	public static void Florence() throws IOException{
		ImageIcon florence= new ImageIcon(("florence.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, "1. Go to the Duomo Cathedral \n 2. Palazzo Vecchio \n 3. Walk over the Ponte Vecchio.","FLORENCE",
				JOptionPane.CANCEL_OPTION,florence);
	}
	public static void London() throws IOException{
		ImageIcon london= new ImageIcon(("london.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, "1. Go visit Big Ben  \n 2. Ride the London Eye \n 3. See the Tower Bridge and Westminster Abbey.","LONDON",
				JOptionPane.CANCEL_OPTION,london);
	}
	public static void Paris() throws IOException{
		ImageIcon paris= new ImageIcon(("newYork.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, "1. Eiffel Tower  \n 2. The Louvre \n 3. Walk along the Champs- Elysees","PARIS",
				JOptionPane.CANCEL_OPTION,paris);
	}
}
