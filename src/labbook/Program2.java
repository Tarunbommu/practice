package labbook;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.Scanner;
import java.util.Date;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Date:(YYYY-MM-DD)");
		String d=sc.nextLine();
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		LocalDate ld1=LocalDate.parse(d);
		
		long dif=ChronoUnit.DAYS.between(ld1, ld);
		long dif1=ChronoUnit.MONTHS.between(ld1, ld);
		long dif2=ChronoUnit.YEARS.between(ld1, ld);
		
		System.out.println(dif+" days, "+dif1+" months, "+dif2+" years");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the date 1");
//		String date1 = sc.nextLine();
//		System.out.println("Enter the date2");
//		String date2 = sc.nextLine();
//		LocalDate ld1 = LocalDate.parse(date1);
//		LocalDate ld2 = LocalDate.parse(date2);
//		long day = ChronoUnit.DAYS.between(ld1, ld2);
//		System.out.println(day);
//		long mon = ChronoUnit.MONTHS.between(ld1, ld2);
//		System.out.println(mon);
//		long year = ChronoUnit.YEARS.between(ld1, ld2);
//		System.out.println(year);
		
		

	}

}
