import java.util.ArrayList;
public class OldMonde{
	private ArrayList <Item> listeItems;
	private int taille;
	public OldMonde(int t){
		listeItems = new ArrayList<Item>();
		taille = t;
	}
	public int getTaille(){ return taille; }
	public int getPositionAlea(){
		return (int)(Math.random()*taille);
	}
	public void ajouterItem(Item item){
		item.setX(getPositionAlea());
		item.setY(getPositionAlea());
		listeItems.add(item);
	}
	public void supprimeItem(Item item){
		for(int i=0; i<listeItems.size(); i++){
			if(listeItems.get(i)==item){
				listeItems.remove(i);
				item.setX(-1);
				item.setY(-1);
			}
		}
	}
	public Item chercher(int x, int y){
		for(int i=0; i<listeItems.size(); i++){
			if(listeItems.get(i).getX()==x && listeItems.get(i).getY()==y)
				return listeItems.get(i);
		}
		return null;
	}
	public ArrayList<Item> getVoisins(Item item){
		ArrayList<Item> voisins = new ArrayList<Item>();
		for(int i=item.getX()-2 ; i<=item.getX()+2; i++){
			for(int j=item.getY()-2; j<=item.getY()+2; j++){
				if(chercher(i,j)!=null && chercher(i,j)!=item)
					voisins.add(chercher(i,j));
			}
		}
		return voisins;
	}
	private static String getNomCourt(String nom){
		if(nom.length()==1)
			return "  "+nom+" ";
		if(nom.length()==2)
			return " "+nom+" ";
		if(nom.length()==3)
			return nom+" ";
		if(nom.length()>4)
			return nom.substring(0,4);
		else
			return nom;
	}
	public void afficher(){
		String s = "";
		for(int j=0; j<taille; j++){
			for(int i=0; i<taille; i++){
				if(chercher(i,j)!=null)
					s+=getNomCourt(chercher(i,j).getNom())+"|";
				else
					s+="    |";
			}
			s+="\n";
		}
		System.out.println(s);
	}
}
