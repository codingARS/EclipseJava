package HackerRank;

import java.io.*;
import java.time.*; 
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

	 class Result {
	    public static String findDay(int month, int day, int year) {
	        String dt = String.format("%d/%02d/%02d",year,month,day);
	        LocalDate localDate1 = LocalDate.parse(dt,
	            DateTimeFormatter.ofPattern("yyyy/MM/dd"));
	        DayOfWeek dayOfWeek 
	            = DayOfWeek.from(localDate1);
	        return dayOfWeek.name();
	    }
	}

	public class DateAndTime {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int month = Integer.parseInt(firstMultipleInput[0]);

	        int day = Integer.parseInt(firstMultipleInput[1]);

	        int year = Integer.parseInt(firstMultipleInput[2]);

	        String res = Result.findDay(month, day, year);

	        bufferedWriter.write(res);
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

