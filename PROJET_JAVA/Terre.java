public class Terre{
    public double ressources;
    public double emissions;
    public int nbGroup;
    
    public Terre(double ressources, double emissions, int nbGroup){
		this.ressources = ressources;
		this.emissions = emissions;
		this.nbGroup = nbGroup;
		
	}
	
	
	public int getNbGroup(){
        return nbGroup;
    }
	
	public double getRessource(){
		return ressources;
	}
	
	public double getEmissions(){
		return emissions;
	}
	
	public double setRessource(){
		return this.ressources;
	}
	
	public double setEmissions(){
		return this.emissions;
	}
	
	public String toString(){
		return "La population mondiale est de : " +getNbGroup()+ "Les ressources sont de "+getRessource()+" tep et chaque jour on emet "+ getEmissions();
		
	}
}
