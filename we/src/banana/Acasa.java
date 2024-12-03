package banana;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Acasa {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date a = sdf.parse("16/02/2000");
			System.out.println(a);
		} catch (ParseException e) {
		
			e.printStackTrace();
		}
		
	}
	
}
