public class Pollution extends Evenement{
	
	
	public Pollution (String nom, double empreinte, int freqAppartition){
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
		return "Les gens roulent de plus en plus au diesel..."
	}
}

