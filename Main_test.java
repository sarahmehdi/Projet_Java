public class Main_test{
	public static void main(String[]args){
		Monde monde = new Monde(10);
		Pomme p1 = new Pomme();
		Pomme p2 = new Pomme();
		Pomme p3 = new Pomme();
		Pomme p4 = new Pomme();
		Pomme p5 = new Pomme();
		
		Pomme p6 = new Pomme();
		Pomme p7 = new Pomme();
		Pomme p8 = new Pomme();
		
		Sac s1 = new Sac();
		Sac s2 = new Sac();
		Sac s3 = new Sac();
		
		Sac s4 = new Sac();
		Sac s5 = new Sac();
		Creature c1 = new Creature();
		Creature c2 = new Creature();
		
		s1.ajouter(p3);
		s2.ajouter(p4);
		s2.ajouter(s1);
		s3.ajouter(p5);
		
		s4.ajouter(p6);
		s5.ajouter(p7);
		
		c1.ajouterAcc(p8);
		c1.ajouterAcc(s4);
		c2.ajouterAcc(s5);
		
		p1.setX(3);
		p2.setX(8);
		s2.setX(5);
		s3.setX(6);
		c1.setX(7);
		c2.setX(2);
		
		p1.setY(2);
		p2.setY(6);
		s2.setY(6);
		s3.setY(1);
		c1.setY(2);
		c2.setY(9);
		
		monde.ajouterItem(p1);
		monde.ajouterItem(p2);
		monde.ajouterItem(s2);
		monde.ajouterItem(s3);
		monde.ajouterItem(c1);
		monde.ajouterItem(c2);
		
		Avatar a1 = new Avatar("lud",58,monde);
		Avatar a2 = new Avatar("sarah",62,monde);
		
		int i;
		Avatar a = a1;
		for(i=0;i<10;i++){
			monde.afficher();
			System.out.println(a.getNom());
			a.seDeplacer();
			a.rencontrerVoisins();
			if(a==a1){ a=a2;} else{a=a1;}
		}
		double d1 = a1.course();
		double d2 = a2.course();
		if(d1>d2){ System.out.println(a1.getNom()+" a gagné !");}
		if(d1<d2){ System.out.println(a2.getNom()+" a gagné !");}
		if(d1==d2){ System.out.println("Egalité !");}
	}
}
