public abstract class Accessoires extends Item{
	private static int cpt=0;
	private int numero;
	public Accessoires(String categorie){
		super(categorie);
		cpt++;
		numero=cpt;
	}
	public abstract double getPoids();
	public int getNumero(){
		return numero;
	}
	public String toString(){
		
		return getNom()+" No "+getNumero()+" "+String.format("%.2f",getPoids())+" Kg ";
	}
}
