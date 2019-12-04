public class OutilsNoms{
	private	static String[] tabNoms={"Bob","Jazz","Fedus"};
	private static int suivant=0;
	private static int succ=1;
	private OutilsNoms(){
	}
	public static String getNom(){
		if (suivant==tabNoms.length ){
			succ++;
			suivant=0;
		}
		String s=tabNoms[suivant]+succ+" \n";
		suivant++;
		return s;
		
	}
}			
