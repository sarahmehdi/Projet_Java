import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;
public class Bonbon extends Accessoires implements Mangeable{
	private double poids;
	private String couleur;
	private Image image=null;
	public Bonbon(){
		super("bonbon");
		poids=Math.random();
		couleur="rose";
		try{
			image = ImageIO.read(new File("bonbon.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public double getPoids(){
		return poids;
	}
	public String toString(){
		return super.toString()+" "+couleur;
	}
	public void dessiner (Graphics g, Monde m){
		int tc=m.getTailleCase();
		g.drawImage(image,getX()*tc,getY()*tc,tc,tc,m);
	}
}
