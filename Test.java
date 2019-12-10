public class Test{
	public static void main (String[] args){
		Pomme p = new Pomme();
		Pomme rouge=new Pomme();
		Pomme verte = new Pomme();
		Sac s= new Sac(4);
		s.ajouter(p);
		s.ajouter(rouge);
		s.ajouter(verte);
		System.out.println(s.getNbAcc());
		System.out.println(s.toString());
		Creature c= new Creature();
		Creature b=new Creature();
		System.out.println(c.courir());
		c.ajouterAcc(p);
		c.ajouterAcc(rouge);
		c.ajouterAcc(verte);
		c.ajouterAcc(new Pomme());
		c.ajouterAcc(s);
		System.out.println(c.courir());
		c.manger();
		System.out.println(c.courir());
		Monde lebled = new Monde(4);
		lebled.ajouterItem(c);
		lebled.ajouterItem(rouge);
		lebled.ajouterItem(verte);
		lebled.afficher();
		Avatar lud = new Avatar("nekki",60,lebled);
		lud.devenirAmi(c);
		lud.devenirAmi(b);
		System.out.println("la creature la plus rapide est "+lud.getCreaturePlusRapide().getNom());
		lud.seDeplacer();
		
		
		/* marche youpii mais y'en a ils disparaissent ché po ils vont ou ces cons 
		ils ont cru c'était le monde à leur mère ils s'barrent oklm wsh 
		c'est le bled mec donc calme toi MERCIIIII*/
		
		
		                                                                          
	}
}
		
