public class Elf extends Creature{
	public Elf(){ super(); }
	public double getVitesse(){
		if(leSac.contientBonbon())
			return 2*super.getVitesse();
		return super.getVitesse();
	}
	public String toString(){
		return "Elf "+super.toString();
	}
	
}
