public class Inondations extends Catastrophe{

    public Inondations(){
        // Empreinte de pollution
        empreinte = 0;

        // Morts
        if(chance < 0.90 || chance > 0.50){
            groupePerd = 1;
        }else if(chance < 0.25){
            groupePerd = 0;
        }else{
            groupePerd = 2;
        }
        
        // Pertes de Ressources
        pertesRess = (int)(Math.random()*(750-50);
    }
}