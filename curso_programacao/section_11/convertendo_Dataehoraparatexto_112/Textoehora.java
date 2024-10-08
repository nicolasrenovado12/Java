package convertendo_Dataehoraparatexto_112;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Textoehora {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d01.format(fmt01));
	}
	
	
}
