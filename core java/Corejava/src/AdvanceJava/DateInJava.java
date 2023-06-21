package AdvanceJava;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateInJava {  
	
	public static void main(String[] args) { // Main method 
		 
		Date date = new Date(); // creating Object of Date Class .. 
		System.out.println("Today's Date: "+date.getDate());
		
		Time time = new Time();
		System.out.println("Current Time :"+time.getTime());
		
		DateTime dateTime = new DateTime();
		System.out.println("Current Date And Time :"+dateTime.getDateTime());
		
		FormatDateTime format = new FormatDateTime();
		System.out.println("After Formate The Date");
		format.formatDateTime();
		
	}

}

class Date{ // class Date
	
	public LocalDate getDate() // method getDate which return Date
	{
		LocalDate currentDate = LocalDate.now();
		return currentDate; 
	}
	
}

class Time{ //Time Class
	public LocalTime getTime() // get time Method which return Current time
	{
		LocalTime time = LocalTime.now();
		return time;
	}
}

class DateTime{ // Class DateTime which return DateTime 
	
	public LocalDateTime getDateTime()  // getDateTime method
	{
		LocalDateTime dt = LocalDateTime.now();
		return dt;
	}
}

class FormatDateTime // Class FormatDateTime which format the Date.... 
{
	public void formatDateTime() // 
	{
		LocalDateTime datetime = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		System.out.println(datetime.format(format));
	}
}