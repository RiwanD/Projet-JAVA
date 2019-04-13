public class Ouragan extends Catastrophe{

    public Ouragan(){
        // Empreinte de pollution
        this.empreinte = 0;
        chance = Math.random();

        // Morts
        if(chance < 0.70 || chance > 0.15){
            this.groupePerd = 1;
        }else if(chance < 0.15){
            this.groupePerd = 0;
        }else{
            this.groupePerd = 2;
        }
        
        // Pertes de Ressources
        this.pertesRess = (int)(Math.random()*500);
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
