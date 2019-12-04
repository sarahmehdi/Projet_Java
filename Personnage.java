public abstract class Personnage{
	private String nom;
	protected double poids;
	public Personnage(String nom ,double poids){
		this.nom=nom;
		this.poids=poids;
	}
	public Personnage(String nom ){
		this(nom,Math.random()*100 -30);
	}
	protected void addPoids(double p){
		if (p>0)
			poids+=p;
	}
	public String toString(){
		return nom+" "+String.format("%.2f",poids)+" kg";
	}
}
	
