package day3;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
//import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date d= new Date();
//		System.out.println(d);
//		System.out.println(d.getYear()+1900);
//		System.out.println(d.getMonth()+1);
//		System.out.println(d.getDate());
				
		
				// Date and time API
//		LocalDate ld= LocalDate.now();
//		ld=ld.plusYears(2);
//		ld=ld.plusDays(5);
//		ld=ld.plusMonths(6);
//		System.out.println(ld);
		
//		LocalDate ld1=LocalDate.parse("2023-02-19");
//		System.out.println(ld1);
		
//		long day=ChronoUnit.YEARS.between(ld1, ld);
//		System.out.println(day);
		
//		LocalTime lt=LocalTime.now();
		
//		System.out.println(lt);
//		LocalTime lt1=LocalTime.parse("10:34:23");
//		System.out.println(lt1);
		
//		long hours = ChronoUnit.HOURS.between(lt1, lt);
//		System.out.println(hours);
		
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime ldt1= LocalDateTime.now();
		ldt1 = ldt.plusDays(2);
		ldt1 = ldt.plusHours(30);
		ldt1 = ldt.minusYears(2);
		System.out.println(ldt1);
		
		LocalDateTime ldt2= LocalDateTime.of(2023,10,4,20,13,30);
		System.out.println(ldt2);
		
		DateTimeFormatter dif = DateTimeFormatter.ofPattern("HH:mm a dd/MM/YYYY");
		System.out.println(dif.format(ldt2));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a dd/MM/YYYY");
		System.out.println(dtf.format(ldt2));
		
//		ZonedDateTime zdt=ZonedDateTime.now();
//		System.out.println(zdt);
		
				
	}

}
