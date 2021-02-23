import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class HiddenPlaces {
	

	public static void cancun() throws IOException{
		System.out.println("Which one would you be interested in? \n 1. Aktun-Chen Natural Park \n 2. Ancient Ruins of Coba \n 3. Garrafon Natural Reef Park ");
		Scanner userInput = new Scanner(System.in);
		int place = userInput.nextInt();
		if (place==1) {
		ImageIcon cancun= new ImageIcon(("park.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, " Aktun-Chen Natural Park ","CANCUN",
				JOptionPane.CANCEL_OPTION,cancun);
		}
		if (place==2) {
			ImageIcon cancun= new ImageIcon(("ruins.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, " Ancient Ruins of Coba ","CANCUN",
					JOptionPane.CANCEL_OPTION,cancun);
		}
		if (place==3) {
			ImageIcon cancun= new ImageIcon(("reef.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, " Garrafon Natural Reef Park ","CANCUN",
					JOptionPane.CANCEL_OPTION,cancun);
		}
	}
	public static void newYork() throws IOException{
		System.out.println("Which one would you be interested in? \n 1. The Elevated Acre \n 2.Secret Gardens of Rockefeller Center \n 3. Street Art ");
		Scanner userInput = new Scanner(System.in);
		int place1 = userInput.nextInt();
		if (place1==1) {
		ImageIcon newYork= new ImageIcon(("acre.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, "The Elevated Acre ","NEW YORK",
				JOptionPane.CANCEL_OPTION,newYork);
		}
		if (place1==2) {
			ImageIcon newYork= new ImageIcon(("garden.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, " Secret Gardens of Rockefeller Center ","NEW YORK",
					JOptionPane.CANCEL_OPTION,newYork);
		}
		if (place1==3) {
			ImageIcon newYork= new ImageIcon(("art.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, " Street Art ","NEW YORK",
					JOptionPane.CANCEL_OPTION,newYork);
		}
	}
	public static void Florence() throws IOException{
		System.out.println("Which one would you be interested in? \n 1.San Marco Museum \n 2.Market in Piazza dei Ciompi \n 3. Torrigiani Garden ");
		Scanner userInput = new Scanner(System.in);
		int place3 = userInput.nextInt();
		if (place3==1) {
		ImageIcon florence= new ImageIcon(("sanMarco.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, "San Marco Museum ","FLORENCE",
				JOptionPane.CANCEL_OPTION,florence);
		}
		if (place3==2) {
			ImageIcon florence= new ImageIcon(("market.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, "Market in Piazzi dei Ciompi ","FLORENCE",
					JOptionPane.CANCEL_OPTION,florence);
		}
		if (place3==3) {
			ImageIcon florence= new ImageIcon(("torrigiani.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, " Torrigiani Garden","FLORENCE",
					JOptionPane.CANCEL_OPTION,florence);
		}
	}
	public static void London() throws IOException{
		System.out.println("Which one would you be interested in? \n 1.St.Dunstatins in the East \n 2.Isabella Plantation \n 3. Roof cafe ");
		Scanner userInput = new Scanner(System.in);
		int place4 = userInput.nextInt();
		if (place4==1) {
		ImageIcon london= new ImageIcon(("dunstain.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, "St.Dunstans in the East","LONDON",
				JOptionPane.CANCEL_OPTION,london);
		}
		if (place4==2) {
			ImageIcon london= new ImageIcon(("isabelle.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, "Isabella Plantation","LONDON",
					JOptionPane.CANCEL_OPTION,london);
			}
		if (place4==3) {
			ImageIcon london= new ImageIcon(("cafe.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, "Queen Elizabeth Roof Garden Cafe","LONDON",
					JOptionPane.CANCEL_OPTION,london);
			}
	}
	public static void Paris() throws IOException{
		System.out.println("Which one would you be interested in? \n 1.Jardins de Luxembourg \n 2. Riding a carousel \n 3. Montmatre Vineyards ");
		Scanner userInput = new Scanner(System.in);
		int place5 = userInput.nextInt();
		if (place5==1) {
		ImageIcon paris= new ImageIcon(("statue.jpeg"));
		MajorPoints frame= new MajorPoints();
		JOptionPane.showMessageDialog(frame, "The Statue of Liberty in the Jardins de Luxembourg","PARIS",
				JOptionPane.CANCEL_OPTION,paris);
		}
		if (place5==2) {
			ImageIcon paris= new ImageIcon(("carousel.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, "Ride the Curious Dodo Manege","PARIS",
					JOptionPane.CANCEL_OPTION,paris);
			}
		if (place5==3) {
			ImageIcon paris= new ImageIcon(("vineyard.jpeg"));
			MajorPoints frame= new MajorPoints();
			JOptionPane.showMessageDialog(frame, "Montmatre Vineyards","PARIS",
					JOptionPane.CANCEL_OPTION,paris);
			}
	}
}

