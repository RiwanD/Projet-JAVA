public class Catastrophe extends Continent{
    public int empreinte;
    public int groupPerd;
    public int pertesRess;
    private int code;

    public Catastrophe(int empreinte, int groupePerd, int pertesRess){
        this.empreinte = empreinte;
        this.groupePerd = groupePerd;
        this.pertesRess = pertesRess;
        code = code + 1;
    }
}