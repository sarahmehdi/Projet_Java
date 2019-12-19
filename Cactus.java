import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;
public class Cactus extends Plante{
		private double vitesseMoins;
		private Image image=null;
		public Cactus(){
			super ("Cactus");
			vitesseMoins= getLongueur()*(1/3.0);
			try{
				image = ImageIO.read(new File("cactus.png"));
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		public double getVitesseMoins(){
			return vitesseMoins;
		}
		public void dessiner (Graphics g, Monde m){
		int tc=m.getTailleCase();
		g.drawImage(image,getX()*tc,getY()*tc,tc,tc,m);
	}
		


}

