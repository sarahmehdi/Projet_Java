public class Creature extends Personnage{
	private Sac leSac;
	public Creature(){
		super(OutilsNoms.getNom());
		leSac=new Sac(10);
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
	
}

