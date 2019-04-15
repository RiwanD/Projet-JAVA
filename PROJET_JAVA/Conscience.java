public class Conscience extends Evenement{
	
	
	public Conscience (String nom, double empreinte, int freqAppartition){
		super(nom, empreinte, freqAppartition);
	}
	
	public String getNom(){
		return nom;
	}
	
	public double getEmpreinte(){
		return empreinte;
	}
	
	public int getFreqApparition(){
		return freqAppartition;
	}
	
	public int setFreqApparition(){
		return this.freqAppartition;
	}
	
	public String toString(){
		return "La population suit les idées de ses dirigeants...";
	}
}
