package br.unit.module4.activity01;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Dates {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar first = Calendar.getInstance();
		System.out.println("First date = " + sdf.format(first.getTime()));
		Calendar last = first;
		// The modify 'last':
		last.add(Calendar.DAY_OF_MONTH, 10);
		last.add(Calendar.MONTH, 3);
		System.out.println("Last date = " + sdf.format(last.getTime()));
		// Duration calculation
		int duration = first.DAY_OF_MONTH - last.DAY_OF_MONTH;
//		int inDays = duration / (1000 * 60 * 60 * 24);
		System.out.println(
				"first.millisecs = " + first.DAY_OF_MONTH
				+ "\nlast.millisecs = " + last.DAY_OF_MONTH
				+ "\nThe difference in DAYS is " + duration + " days."
				);
		
	}
}
