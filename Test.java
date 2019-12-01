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
	}
}
		
