import java.awt.*;
import javax.swing.*;
public class Cactus extends Plante{
		private double vitesseMoins;
		public Cactus(){
			super ("Cactus");
			vitesseMoins= getLongueur()*(1/3.0);
		}
		public double getVitesseMoins(){
			return vitesseMoins;
		}
		public void dessiner (Graphics g, Monde m){
		int tc=m.getTailleCase();
		g.setColor(new Color(0,255,0)); 
		g.fillOval(getX()*tc/2,getY()*tc, tc,tc); 
	}
		


}

