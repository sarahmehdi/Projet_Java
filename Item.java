import java.awt.*;
import javax.swing.*;

public abstract class Item {
	private final String nom;
	private int x ,y;
	public Item (String nom, int x , int y){
		 this.nom=nom;
		 this.x=x;
		 this.y=y;
	}
	public Item (String nom){
		 this (nom,-1,-1);
	}
	public int getX () {
		 return x;
	}
	public int getY () { 
		return y;
	}
	protected void setX ( int x){ 
		this.x=x;
	}
	protected void setY ( int y) { 
		this.y=y;
	}
	public String getNom(){ 
		return nom;
	}
	public String toString(){ 
		return nom+"("+x+","+y+")";
	}
	public int distance( Item item ){ // distance de Manhattan
		return Math.abs(x-item.x)+Math.abs(y-item.y);
	}
	public void dessiner( Graphics g , Monde m){
		int tc=m.getTailleCase();
		g.setColor(new Color(0,0,255));
		g.fillRect(getX()*tc, getY()*tc, tc, tc);
	}
}
