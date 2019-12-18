import java.awt.*;
import javax.swing.*;
public class Pomme extends Accessoires implements Mangeable {
	private double rayon;
	private double poids;
	public Pomme(){
		super("pomme");
		rayon=Math.random()*5+3;
		poids=(4.0/3000)*3.14*rayon*rayon*rayon;

	}
	public double getPoids(){
		return poids;
	}
	public String toString(){
		return super.toString()+" "+String.format("%.2f",rayon)+" cm";
	}
	public void dessiner (Graphics g, Monde m){
		int tc=m.getTailleCase();
		g.setColor(new Color(255,0,0));//couleur courante devient rouge 
		g.fillOval(getX()*tc,getY()*tc, tc,tc);//cercle plein 
	}
}

