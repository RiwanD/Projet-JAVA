public class Inondations extends Catastrophe{

    public Inondations(){
        // Empreinte de pollutio
		chance = Math.random();
        this.empreinte = 0;

        // Morts
        if(chance < 0.90 || chance > 0.50){
            this.groupePerd = 1;
        }else if(chance < 0.25){
            this.groupePerd = 0;
        }else{
            this.groupePerd = 2;
        }
        
        // Pertes de Ressources
        pertesRess = (int)(Math.random()*(750-50);
    }
    
    public int getEmpreinte(){
		return empreinte;
	}
	public int getGroupePerd(){
		return groupePerd;
	}
	public int getPerteRess(){
		return pertesRess;
	}
}
