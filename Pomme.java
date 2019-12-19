import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;
public class Pomme extends Accessoires implements Mangeable {
	private double rayon;
	private double poids;
	private Image image=null;
	public Pomme(){
		super("pomme");
		rayon=Math.random()*5+3;
		poids=(4.0/3000)*3.14*rayon*rayon*rayon;
		try{
			image = ImageIO.read(new File("pomme.png"));
		}catch(IOException e){
			e.printStackTrace();
		}

	}
	public double getPoids(){
		return poids;
	}
	public String toString(){
		return super.toString()+" "+String.format("%.2f",rayon)+" cm";
	}
	public void dessiner (Graphics g, Monde m){
		int tc=m.getTailleCase();
		g.drawImage(image,getX()*tc,getY()*tc,tc,tc,m);
	}
}

