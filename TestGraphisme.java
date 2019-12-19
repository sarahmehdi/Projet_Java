import java.awt.*;
import javax.swing.*;
public class TestGraphisme {
	private static final int TAILLE_CASE=30;
	private static final int NB_CASES=20;
	public static void main ( String[]args ) throws InterruptedException{
		// Cré a t i o n f e n ê t r e g r a p h i q u e e t s e s c a r a c t é r i s t i q u e s
		JFrame f=new JFrame ( ) ;
		f.setLocationRelativeTo( null ) ;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;

		// Cré a t i o n du monde ( q u i e s t un panneau )
		Monde m=new Monde (NB_CASES,TAILLE_CASE) ;
		f.setContentPane(m) ; // Aj out du monde à l a f e n ê t r e
		f.pack(); // A d a p t a t i o n de l a f e n ê t r e au panneau
		f.setVisible( true ) ;
		
		Pomme p1 = new Pomme();
		Bonbon b1 = new Bonbon();
		Pomme p3 = new Pomme();
		Bonbon b2 = new Bonbon();
		Pomme p5 = new Pomme();
		
		Bonbon b3 = new Bonbon();
		Pomme p7 = new Pomme();
		Pomme p8 = new Pomme();
		
		Sac s1 = new Sac();
		Sac s2 = new Sac();
		Sac s3 = new Sac();
		
		Cactus cac1 = new Cactus();
		Cactus cac2 = new Cactus();
		Cactus cac3 = new Cactus();
		Cactus cac4 = new Cactus();
		
		
		Sac s4 = new Sac();
		Sac s5 = new Sac();
		Creature c1 = new Creature();
		Creature c2 = new Creature();
		
		Elf e1= new Elf();
		Elf e2= new Elf();
		
		Pomme verte = new Pomme();
		Pomme rouge = new Pomme();
		Pomme jaune = new Pomme();
		Bonbon b = new Bonbon();
		Sac sac = new Sac();
		
		sac.ajouter(jaune);
		e1.ajouterAcc(verte);
		e1.ajouterAcc(b);
		e2.ajouterAcc(rouge);
		e2.ajouterAcc(sac);
		
		s1.ajouter(p3);
		s2.ajouter(b2);
		s2.ajouter(s1);
		s3.ajouter(p5);
		
		s4.ajouter(b3);
		s5.ajouter(p7);
		
		c1.ajouterAcc(p8);
		c1.ajouterAcc(s4);
		c2.ajouterAcc(s5);
		
		p1.setX(3);
		b1.setX(8);
		s2.setX(5);
		s3.setX(6);
		c1.setX(7);
		c2.setX(2);
		e1.setX(4);
		e2.setX(1);
		
		p1.setY(2);
		b1.setY(6);
		s2.setY(6);
		s3.setY(1);
		c1.setY(2);
		c2.setY(9);
		e1.setY(4);
		e2.setY(3);
		
		m.ajouterItem(cac4);
		m.ajouterItem(p1);
		m.ajouterItem(b1);
		m.ajouterItem(s2);
		m.ajouterItem(cac2);
		m.ajouterItem(s3);
		m.ajouterItem(c1);
		m.ajouterItem(cac3);
		m.ajouterItem(c2);
		m.ajouterItem(e1);
		m.ajouterItem(cac4);
		m.ajouterItem(e2);
		m.ajouterItem(cac1);
		
		
		Avatar a1 = new Avatar("lud",58,m);
		Avatar a2 = new Avatar("sarah",62,m);
		
		Avatar a = a1;
		for(int i=0;i<2;i++){
			m.afficher();
			System.out.println(a.getNom());
			Thread.sleep(1000) ; // R a l e n t i l ’ a f f i c h a g e
			a1.seDeplacer();
			a2.seDeplacer();
			a.rencontrerVoisins();
			if(a==a1){ a=a2;} else{a=a1;}
			m.repaint( ) ; // R e d e s s i n e l e g r a p h i q u e
		}
		int i;
		
		double d1 = a1.course();
		double d2 = a2.course();
		if(d1>d2){ System.out.println(a1.getNom()+" a gagné !");}
		if(d1<d2){ System.out.println(a2.getNom()+" a gagné !");}
		if(d1==d2){ System.out.println("Egalité !");}
	}
		
	
}
