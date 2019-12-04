import java.util.ArrayList;
import java.util.Scanner;

public class Avatar extends Personnage{
	public ArrayList <Creature> listeAmis;
	public ArrayList <Accessoires> listeAcc;
	private Monde monde;
	//je crois que je vais ajouter une public void ajouterAcc(Accessoires a)
	public Avatar(String nom,double poids,Monde m){
		super(nom,poids);
		monde = m;
		monde.ajouterItem(this);
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
			System.out.println (c.getNom()+" devient ami avec "+super.getNom());
		}
	}
	public void perdreAmi(Creature c){
		if (estAmis(c)){
			for(int i=0;i<listeAmis.size();i++){
				if(c==listeAmis.get(i)){	
					listeAmis.remove(i);
					System.out.println(c.getNom()+" n'est plus ami avec "+super.getNom());
				}
			}
		}
	}
	public void rencontrerAmi(Creature c){
		if (listeAcc.size()==0)
			perdreAmi(c);
		else{
			c.ajouterAcc(listeAcc.get(0));
			if (listeAcc.get(0).getPoids() > 0.5){
				devenirAmi(c);
			}
			listeAcc.remove(listeAcc.get(0));
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
				if(c.getVitesse()<listeAmis.get(i).getVitesse()){
					c=listeAmis.get(i);
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
	public void ramasser(Accessoires a){
		listeAcc.add(a);
		monde.supprimeItem(a);
		System.out.println(this.getNom()+" rammasse "+a.getNom());
	}
	public void rencontrerVoisins(){
		for(int i=0; i<monde.getVoisins(this).size() ;i++){
			if(monde.getVoisins(this).get(i) instanceof Accessoires)
				ramasser((Accessoires)(monde.getVoisins(this).get(i)));
			if(monde.getVoisins(this).get(i) instanceof Creature)
				rencontrerAmi((Creature)(monde.getVoisins(this).get(i)));
			if(monde.getVoisins(this).get(i) instanceof Avatar)
				System.out.println(this.getNom()+" fait un salut a "+monde.getVoisins(this).get(i).getNom());
		}
	}
	public void seDeplacer(){
		int i=5;
		int j=5;
		while(i>=4){
			System.out.println("Entrez une abcisse entre [0;4]");
			Scanner sc= new Scanner(System.in);
			i=sc.nextInt();
		}
		while(j>=4){
			System.out.println("Entrez une ordonnee entre [0;4]");
			Scanner sc2= new Scanner(System.in);
			j=sc2.nextInt();
		}
		System.out.println("Deplacement de "+this.getNom()+" de ["+this.getX()+";"+this.getY()+"] a ["+i+";"+j+"]");
		this.setX(i);
		this.setY(j);
	}
}
		
	
