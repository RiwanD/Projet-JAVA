public class Incendie extends Catastrophe{

    public Incendie(){
        // Empreinte de pollution
        double chance = Math.random();
        if(chance < 0.75){
            this.empreinte = 1;
        }else{
            this.empreinte = 3;
        }

        // Morts
        this.groupePerd = 0;

        // Pertes de Ressources
        if(chance < 0.85){
            pertesRess = (int)(Math.random()*(250-100));
        }else{
            pertesRess = (int)(Math.random()*(750-300));
        }
    }
}
