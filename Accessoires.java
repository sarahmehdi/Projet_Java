public abstract class Accessoires{
	private static int cpt=0;
	private int numero;
	private String categorie;
	public Accessoires(String categorie){
		this.categorie=categorie;
		cpt++;
		numero=cpt;
	}
	public abstract double getPoids();
	public int getNumero(){
		return numero;
	}
	public String toString(){
		
		return categorie+" No "+getNumero()+" "+String.format("%.2f",getPoids())+" Kg ";
	}
}
