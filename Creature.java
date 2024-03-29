import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;
public class Creature extends Personnage{
	protected Sac leSac;
	private Image image=null;
	public Creature(){
		super(OutilsNoms.getNom());
		leSac=new Sac(10);
		try{
			image = ImageIO.read(new File("creature.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void ajouterAcc(Accessoires a){
		if(leSac.getPoids() + a.getPoids() < super.poids)
			leSac.ajouter(a);
		else
			System.out.println("Trop lourd");
	}
	public double getVitesse(){
		return (1.0/4)*super.poids -leSac.getPoids();
	}
	public void manger(){
		int i=0;
		while(i<10){
			Accessoires a=leSac.retourner(i);
			
			if(a instanceof Mangeable ){
				super.addPoids(((Mangeable)a).getPoids());
			}
			else {
				leSac.ajouter(a);
				i++;
			}
		}
	}
	public void manger(Mangeable m){
		super.addPoids(m.getPoids());
	}
	public String courir(){
		return super.toString()+" court a vitesse "+String.format("%.2f",getVitesse())+" avec "+leSac.toString();
	}
	public void dessiner (Graphics g, Monde m){
		int tc=m.getTailleCase();
		//g.setColor(new Color(0,0,0)); //les creatures sont en noir
		//g.fillOval(getX()*tc,getY()*tc, tc,tc); 
		g.drawImage(image,getX()*tc,getY()*tc,2*tc,2*tc,m);
	}
}

