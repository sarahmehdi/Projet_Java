import java.awt.*;
import javax.swing.*;
public abstract class Personnage extends Item{
	protected double poids;
	public Personnage(String nom ,double poids){
		super(nom);
		this.poids=poids;
	}
	public Personnage(String nom ){
		this(nom,Math.random()*100 +30);
	}
	protected void addPoids(double p){
		if (p>0)
			poids+=p;
	}
	public String toString(){
		return getNom()+" "+String.format("%.2f",poids)+" kg";
	}
	public  abstract void dessiner( Graphics g , Monde m);

}
	
