public class Jeu{
    public static int pollution = 50;
    public static int ressources = 10000;
    private static int tour = 1;


    public static void main(String[]args){
        System.out.println("Bienvenue sur le jeu");
        System.out.println("Le principe est simple :");
        System.out.println("Descendre la Pollution à 0");
        System.out.println("Garder l'humanité en vie");
        System.out.println("Garder des ressources");
        System.out.println("Bonne chance !");
        System.out.println("");

        Continent asie = new Continent("Asie", 300, 1);
        Continent europe = new Continent("Europe", 150, 2);
        Continent afrique = new Continent("Afrique", 300, 3);
        Continent amerique = new Continent("Amérique", 200, 4);
        Continent oceanie = new Continent("Océanie", 50, 5);
        Continent [] continent = new Continent[]{asie,europe, afrique, amerique, oceanie};

        System.out.println("Contients crées, lancement de la partie");
System.out.println((int) Math.round(Math.random()*2+1));
     //   while(pollution > 0) && (pollution < 1000){
       //     for(int val:continent){
		//		if (
          //      if(tour%5==0){
            //        double roulette = Math.random();

              //  }else{

          //      }
            //}
        //}
        
    }
}
