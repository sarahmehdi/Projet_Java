import java.awt.*;
import javax.swing.*;
public class Sac extends Accessoires{ 
	private Accessoires[] tab;
	public Sac(int n){
		super("sac");
		tab= new Accessoires[n];
	}
	public Sac(){
		this((int)(Math.random()*10)+1);
	}
	public int size(){
		return tab.length ;
	}
	public void ajouter(Accessoires a){
		for (int i=0;i<tab.length;i++){
			if (tab[i]==null){
				tab[i]=a;
				break ;
			}
		}
	}
	public Accessoires retourner(int i){
		Accessoires a;
		if (tab[i]!=null ){
			a=tab[i];
			for (int j=i;j<getNbAcc();j++){
				tab[j]=tab[j+1];
			}
			tab[getNbAcc()]=null;
			return a;
		}
		else 
			return null;
	}
	public int getNbAcc(){
		int num=0;
		for(int i=0;i<tab.length;i++){
			if (tab[i]!=null){
				num++;
			}
		}
		return num;
	}
	public double getPoids(){
		double somme=0;
		for (int i=0;i<tab.length;i++){
				if (tab[i]!= null)
				somme+=tab[i].getPoids();
		}
		return somme;
	}
	public String toString(){
		String s="Sac no "+super.getNumero()+" "+String.format("%.2f",getPoids())+"kg contient "+getNbAcc()+" accessoires sur "+tab.length+" places \n";
		for (int i=0;i<tab.length;i++){
			if (tab[i]!=null) {
				
				s+=tab[i].toString()+"\n";
			}
		}
		return s;
	}
	public boolean contientBonbon(){
		for(Accessoires a : tab){
			if(a instanceof Bonbon)
				return true;
		}
		return false;
	}
	public void dessiner (Graphics g, Monde m){
		int tc=m.getTailleCase();
		g.setColor(new Color(255,0,0)); 
		g.drawRec(getX()*tc,getY()*tc, tc,tc); 
	}
}
		
