import java.util.ArrayList;
public class Avatar extends Personnage{
	public ArrayList <Creature> listeAmis;
	public ArrayList <Accessoires> listeAcc;
	//je crois que je vais ajouter une public void ajouterAcc(Accessoires a)
	public Avatar(String nom,double poids){
		super(nom,poids);
		listeAmis=new ArrayList<Creature>();
		listeAcc= new ArrayList<Accessoires>();
	}
	public String toString(){
		String s=super.toString();
		int compteurAmis=0;
		int compteurAcc =0;
		for (int i=0;i<listeAmis.size();i++){
			if (listeAmis.get(i) != null){
				compteurAmis++;
			}
		}
		s+=compteurAmis+" Ami(s) ";
		for(int i=0; i<listeAcc.size();i++) {
			if (listeAcc.get(i) != null){
				compteurAcc++;
			}
		}
		s+=compteurAcc+" accesoire(s)";
		return s;
	}
	
		
	public boolean estAmis(Creature c){
		return listeAmis.contains(c);
	}
	public void devenirAmi(Creature c) {
		if( ! estAmis(c)){
			listeAmis.add(c);
			System.out.println (c.toString()+" devient ami avec "+super.toString());
		}
	}
	public void perdreAmi(Creature c){
		if (estAmis(c)){
			for(int i=0;i<listeAmis.size();i++){
				if(c==listeAmis.get(i)){	
					listeAmis.remove(i);
				}
			}
		}
	}
	public void rencontrerAmi(Creature c){
		if (listeAcc.get(0) != null ){
			c.ajouterAcc(listeAcc.get(0));
			if (listeAcc.get(0).getPoids() > 0.5 && estAmis(c) ){
				devenirAmi(c);
			}
			listeAcc.remove(listeAcc.get(0));
		}
		else
		{
			if (listeAmis.contains(c)) 
				perdreAmi(c);
		}
	}
	public double course(){
		double d=0;
		for(int i=0;i<listeAmis.size();i++){
			listeAmis.get(i).manger();
		}
		for(int i=0;i<listeAmis.size();i++){
			System.out.println(listeAmis.get(i).courir());
			d+=listeAmis.get(i).getVitesse()*1;
		}
		return d;
	}
	public Creature getCreaturePlusRapide(){
		Creature c =listeAmis.get(0);
		for(int i=0;i<listeAmis.size();i++){
				if(listeAmis.get(i).getVitesse()<listeAmis.get(i+1).getVitesse()){
					c=listeAmis.get(i+1);
				}
		
		}	
		return c;
		
	}
	public int compterAccMangeable(){
		int cpt=0;
		for(int i=0;i<listeAcc.size();i++){
			if (listeAcc.get(i) instanceof Mangeable){
				cpt++;
			}
		}
		return cpt;
	}
		
}
		
	
