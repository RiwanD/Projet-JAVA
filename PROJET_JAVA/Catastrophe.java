public class Catastrophe{
    public int empreinte;
    public int groupePerd;
    public int pertesRess;
    private int code;
    public double chance;

    public Catastrophe(int empreinte, int groupePerd, int pertesRess){
        this.empreinte = empreinte;
        this.groupePerd = groupePerd;
        this.pertesRess = pertesRess;
        code = code + 1;
    }
    public abstract int getEmpreinte();
	public abstract int getGroupePerd();
	public abstract int getPerteRess();
}
