package academy.lgs.exercice_02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDate {
	
	public static void dateConverter() {
		Date input = new Date();
		
		LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalTime time = input.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
		LocalDateTime dateAndTime = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		
		System.out.println("Сьогодні на дворі " + date + " та за києвським часом у вас " + time + " година");
		System.out.println("Ті ж самі дані тільки повністю " + dateAndTime + ")))");
		
	}
}
