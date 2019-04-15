public class Deforestation extends Evenement{
	
	
	public Deforestation (String nom, double empreinte, int freqAppartition){
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
}
