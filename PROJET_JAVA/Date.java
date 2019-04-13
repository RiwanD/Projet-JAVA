import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date{
	public int annee;
	public int mois;
	public int jour;
	public static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	public static Calendar calendar;
	
	public Date(){
		//calendar = Calendar.getInstance();
		this.annee = calendar.get(Calendar.YEAR);
		this.annee = calendar.get(Calendar.YEAR);
		this.jour = calendar.get(Calendar.DAY_OF_MONTH);
		
	}

public static void main(String[]args){
	
Calendar calendar = Calendar.getInstance();
        System.out.println(dateFormat.format(calendar.getTime()));
}
}
