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
		Avatar jake=new Avatar ( "Jake" , 79.5,m) ; // a j o u t e Jake dans l e monde
		for ( int i =0; i <10; i++) {
		Thread.sleep(1000) ; // R a l e n t i l ’ a f f i c h a g e
		jake.seDeplacer() ;
		m.repaint( ) ; // R e d e s s i n e l e g r a p h i q u e
		}
	}
}
