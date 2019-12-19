import java.awt.*;
import javax.swing.*;
public abstract class Plante extends Item{
	private  double longueur ;
	public Plante(String nom){
		super(nom);
		longueur=Math.random()*20 +1;
	}
	public double getLongueur(){
		return longueur ;
	}
	
	public  abstract void dessiner( Graphics g , Monde m);
	
}
