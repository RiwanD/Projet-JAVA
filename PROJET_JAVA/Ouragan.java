public class Ouragan extends Catastrophe{

    public Ouragan(){
        // Empreinte de pollution
        empreinte = 0;

        // Morts
        if(chance < 0.70 || chance > 0.15){
            groupePerd = 1;
        }else if(chance < 0.15){
            groupePerd = 0;
        }else{
            groupePerd = 2;
        }
        
        // Pertes de Ressources
        pertesRess = (int)(Math.random()*(500-0);
    }
}