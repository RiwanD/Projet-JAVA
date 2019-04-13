public class Humanite{
    public int totalvie;
    public int totalmort;
    public int empreintetot;
    
    public Humanite(Continent [] continent){
		for(Continent val:continent){
			this.totalvie += val.getNbGroup();
		}
    }

    public int getPopVivante(){
        return totalvie;
    }
}
