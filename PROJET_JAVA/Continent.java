public class Continent{
    public int nbGroup;
    public String nom;
    public int chiffre;
    public int org;

    public Continent(String nom, int nbGroup,int chiffre){
        this.nbGroup = nbGroup;
        this.nom = nom;
        this.chiffre = chiffre;
		this.org = (int) Math.round(Math.random()*2+1);
    }

    public int getNbGroup(){
        return nbGroup;
    }
	
	public int getOrg(){
		return org;
	}
	
	public int setOrg(){
		return this.org;
	}
    public String getNom(){
		return nom;
	}
    
    public String toString(){
        int pop = nbGroup * 7;
        return "Continent : "+nom+", possède une population de : "+pop+
        " millions d'habitants";
    }
}
