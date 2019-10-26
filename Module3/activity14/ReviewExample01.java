package activity14;

import java.util.Scanner;

public class ReviewExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=== Options ===" +
							"\n 1 . Insert" +
							"\n 2 . List" +
							"\n 3 . Search" +
							"\n 4 . Delete" +
							"\n 5 . Exit system" +
							"\n Enter an option above: ");
		
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		switch (first) {
		case 1:
			System.out.println("Choose 1");
			break;
		case 2:
			System.out.println("Choose 2");
			break;
		case 3:
			System.out.println("Choose 3");
			break;
		case 4:
			System.out.println("Choose 4");
			break;
		case 5:
			System.out.println("Choose 5");
			break;

		default:
			System.out.println("Exit application");
			break;
		}
		
		sc.close();
		
	}

}
