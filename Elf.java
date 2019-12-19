import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.*;

public class Elf extends Creature{
	private Image image = null;
	public Elf(){ super(); 
		try{
			image = ImageIO.read(new File("pikachu.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public double getVitesse(){
		if(leSac.contientBonbon())
			return 2*super.getVitesse();
		return super.getVitesse();
		
	}
	public String toString(){
		return "Elf "+super.toString();
	}
	public void dessiner (Graphics g, Monde m){
		int tc=m.getTailleCase();
		g.drawImage(image,getX()*tc,getY()*tc,tc,tc,m);
	}
			
	
}
