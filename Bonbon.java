import java.awt.*;
import javax.swing.*;
public class Bonbon extends Accessoires implements Mangeable{
	private double poids;
	private String couleur;
	private static int cpt=0;
	public Bonbon(){
		super("bonbon");
		poids=Math.random();
		if(cpt%3==1){couleur = "rouge";}
		if(cpt%3==2){couleur = "jaune";}
		if(cpt%3==0){couleur = "rose";}
		cpt++;
	}
	public double getPoids(){
		return poids;
	}
	public String toString(){
		return super.toString()+" "+couleur;
	}
	public void dessiner (Graphics g, Monde m){
		int tc=m.getTailleCase();
		g.setColor(new Color(255,0,0)); 
		g.drawOval(getX()*tc,getY()*tc, tc,tc); 
	}
}
