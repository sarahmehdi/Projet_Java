import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.util.InputMismatchException;
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
		f.setVisible( true );
		
		
		Pomme p1 = new Pomme();
		Bonbon b1 = new Bonbon();
		Pomme p3 = new Pomme();
		Bonbon b2 = new Bonbon();
		Pomme p5 = new Pomme();
		Pomme p12 = new Pomme();
		Pomme p13 = new Pomme();
		
		Bonbon b3 = new Bonbon();
		Pomme p7 = new Pomme();
		Pomme p8 = new Pomme();
		Pomme p9 = new Pomme();
		Pomme p10 = new Pomme();
		Pomme p11 = new Pomme();
		Bonbon b4 = new Bonbon();
		Bonbon b5 = new Bonbon();
		Bonbon b6 = new Bonbon();
		Bonbon b7 = new Bonbon();
		Bonbon b8 = new Bonbon();
		
		Sac s1 = new Sac();
		Sac s2 = new Sac();
		Sac s3 = new Sac();
		Sac s4 = new Sac();
		Sac s5 = new Sac();
		Sac s6 = new Sac();
		Sac s7 = new Sac();
		Sac s8 = new Sac();
		
		Cactus cac1 = new Cactus();
		Cactus cac2 = new Cactus();
		Cactus cac3 = new Cactus();
		Cactus cac4 = new Cactus();
		
		
		Sac s9 = new Sac();
		Sac s10 = new Sac();
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
		s3.ajouter(p12);
		s3.ajouter(p13);
		
		s9.ajouter(b3);
		s10.ajouter(p7);
		
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
		e2.setX(10);
		p9.setX(6);
		p10.setX(7);
		p11.setX(2);
		b4.setX(4);
		b5.setX(1);
		b6.setX(6);
		b7.setX(7);
		b8.setX(2);
		s9.setX(4);
		s10.setX(1);
		s6.setX(4);
		s7.setX(1);
		s8.setX(4);
		s4.setX(10);
		s5.setX(18);
		cac1.setX(7);
		cac2.setX(4);
		cac1.setY(10);
		cac2.setY(18);		
		p1.setY(2);
		b1.setY(6);
		s2.setY(6);
		s3.setY(1);
		c1.setY(2);
		c2.setY(9);
		e1.setY(4);
		e2.setY(10);
		p9.setY(6);
		p10.setY(7);
		p11.setY(2);
		b4.setY(4);
		b5.setY(1);
		b6.setY(6);
		b7.setY(7);
		b8.setY(2);
		s9.setY(4);
		s10.setY(15);
		s6.setY(4);
		s7.setY(10);
		s8.setY(15);
		s7.setX(4);
		s8.setX(3);
		
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
		m.ajouterItem(p9);
		m.ajouterItem(p10);
		m.ajouterItem(p11);
		m.ajouterItem(b4);
		m.ajouterItem(b5);
		m.ajouterItem(b6);
		m.ajouterItem(b7);
		m.ajouterItem(b8);
		m.ajouterItem(s9);
		m.ajouterItem(s10);
		m.ajouterItem(s6);
		m.ajouterItem(s7);
		m.ajouterItem(s8);
	

		System.out.println("Bienvenue dans le jeu\nSelectionnez le mode que vous voulez\nPartie Solo : entrez 1\nPartie à deux : entrez 2\n");
		int n=0;
		while(n!=1 && n!=2){
			System.out.println("Veuillez entrer 1 ou 2");
			try{
				Scanner sc= new Scanner(System.in);
				n=sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("veuillez entrer un entier");
			}
		}

		switch(n){
			case(1):{
				System.out.println("Vous avez choisi une partie solo\nCombien de tours voulez vous jouer ?");
				int nbtours = 0;
				while(nbtours<1){
					System.out.println("vous devez jouer au moins une partie");
					try{
						Scanner sc1= new Scanner(System.in);
						nbtours=sc1.nextInt();
					}catch(InputMismatchException e){
						System.out.println("veuillez entrer un entier");
					}
				}
				System.out.println("Quel sera le nom de votre avatar ?");
				Scanner sc2= new Scanner(System.in);
				String nom = sc2.nextLine();
				Avatar a = new Avatar(nom,50,m);
				System.out.println("Votre avatar "+nom+" pese 50kg");
				System.out.println("Debut de la partie");
				Thread.sleep(2000);
				for(int i=0;i<nbtours;i++){
					m.afficher();
					System.out.println(a.getNom());
					Thread.sleep(1000) ; // R a l e n t i l ’ a f f i c h a g e
					a.seDeplacer();
					a.rencontrerVoisins();
					m.repaint( ) ; // R e d e s s i n e l e g r a p h i q u e
				}
		}
		case(2):{
			System.out.println("Vous avez choisi une partie a deux\nCombien de tours voulez vous chacun jouer ?(veuillez entrer un entier >1");
				int nbtours = 0;
				while(nbtours<2){
					try{
						Scanner sc3= new Scanner(System.in);
						nbtours=sc3.nextInt();
					}catch(InputMismatchException e){
						System.out.println("veuillez entrer un entier");
					}
				}
				System.out.println("Quel sera le nom de l'avatar numero 1 ?");
				Scanner sc4= new Scanner(System.in);
				String nom1 = sc4.nextLine();
				Avatar a1 = new Avatar(nom1,50,m);
				System.out.println("Votre avatar "+nom1+" pese 50kg");
				System.out.println("Quel sera le nom de l'avatar numero 2 ?");
				Scanner sc5= new Scanner(System.in);
				String nom2 = sc5.nextLine();
				Avatar a2 = new Avatar(nom2,50,m);
				System.out.println("Votre avatar "+nom2+" pese 50kg");
				System.out.println("Debut de la partie");
				Thread.sleep(2000);

				Avatar a = a1;
				for(int i=0;i<2;i++){
					m.afficher();
					System.out.println(a.getNom());
					Thread.sleep(1000) ; // R a l e n t i l ’ a f f i c h a g e
					a.seDeplacer();
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
	}
	
}
