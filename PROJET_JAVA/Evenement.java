public abstract class Evenement{
    protected String nom;
    protected double empreinte;
    protected int freqAppartition;
	
	public Evenement(String nom, double empreinte, int freqAppartition){
		this.nom = nom;
		this.empreinte = empreinte;
		this.freqAppartition = freqAppartition;
		
	}
    
    public abstract String getNom();
    public abstract double getEmpreinte();
    public abstract int getFreqApparition();
    public abstract int setFreqApparition();
    public abstract String toString();
}
