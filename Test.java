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
		// ça compile et ça s'exécute très bien juste parfois le poids est negatifs ou alors la vitesse a revoir MERCI!!
		
		                                                                                                   
	}
}
		
