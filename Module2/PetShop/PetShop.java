package animals;

import java.util.Scanner;

import entities.Cachorro;
import entities.Gato;
import entities.Passaro;

public class PetShop {
	public static void main(String[] args) {
		// Creating a PetShop
		AnimalsCollection petShop = new AnimalsCollection();

		Scanner scan = new Scanner(System.in);
		boolean wannnaAddNewAnimal = true;
		while (wannnaAddNewAnimal) {

			System.out.println("Good morning/evenning. Are you here to GET (Digit 1) or to WASH (Digit 0) your animal?");
			int operation = scan.nextInt();
			while (operation != 0 && operation != 1) {
				System.out.println("Wrong option. Try again: ");
				operation = scan.nextInt();
			}
			if (operation == 0) { // Operation to INSERT animal to the System;
				// System.out.println("Do you have an animal?");
				// String anwser = scan.nextLine();
				// System.out.println("You said: " + anwser);
				// if (anwser.matches("[yesYES]+")) {
				System.out
						.println("What type of animal? Choose: \n '1' for a Dog; \n '2' for a Cat; \n '3' for a Bird.");
				int animalNumber = scan.nextInt();
				while (animalNumber != 1 && animalNumber != 2 && animalNumber != 3) {
					System.out.println("Wrong option. Try again");
					animalNumber = scan.nextInt();
				}
				System.out.println("You wrote: " + animalNumber);
				if (animalNumber == 1) {
					Cachorro dog2 = new Cachorro();
					// Setting name:

					System.out.println("Write the name of the Dog: ");
					//dog2.nameString() = scan.next();
					dog2.setNameString(scan.next());

					// Setting age:
					System.out.println("How old is " + dog2.getNameString() + ": ");
//					dog2.age = scan.nextInt();
					dog2.setAge(scan.nextInt());

					// Setting gender:
					System.out.println("And the gender of " + dog2.getNameString() + ": ");
//					dog2.genderString = scan.next();
					dog2.setGenderString(scan.next());

					// Setting age:
					System.out.println("Finally, how heavy is our " + dog2.getNameString() + "? ");
//					dog2.weight = scan.nextInt();
					dog2.setWeight(scan.nextInt());
					
					dog2.communicate();
					System.out.println("All set. Thanks!");
					petShop.add(dog2);
					
				} else if (animalNumber == 2) {
					Gato cat2 = new Gato();
					// Setting name:
					System.out.println("Write the name of the Cat: ");
//					cat2.nameString = scan.next();
					cat2.setNameString(scan.next());

					// Setting age:
					System.out.println("How old is " + cat2.getNameString() + ": ");
//					cat2.age = scan.nextInt();
					cat2.setAge(scan.nextInt());

					// Setting gender:
					System.out.println("And the gender of " + cat2.getNameString() + ": ");
//					cat2.genderString = scan.next();
					cat2.setGenderString(scan.next());

					// Setting age:
					System.out.println("Finally, how heavy is our " + cat2.getNameString() + "? ");
//					cat2.weight = scan.nextInt();
					cat2.setWeight(scan.nextInt());

					System.out.println("All set. Thanks!");
					cat2.communicate();
					petShop.add(cat2);
					
				} else if (animalNumber == 3) {
					Passaro bird2 = new Passaro();
					// Setting name:
					System.out.println("Write the Bird's name: ");
//					bird2.nameString = scan.next();
					bird2.setNameString(scan.next());

					// Setting age:
					System.out.println("How old is " + bird2.getNameString() + ": ");
//					bird2.age = scan.nextInt();
					bird2.setAge(scan.nextInt());

					// Setting gender:
					System.out.println("And the gender of " + bird2.getNameString() + ": ");
//					bird2.genderString = scan.next();
					bird2.setGenderString(scan.next());

					// Setting age:
					System.out.println("Finally, how heavy is our " + bird2.getNameString() + "? ");
//					bird2.weight = scan.nextInt();
					bird2.setWeight(scan.nextInt());

					System.out.println("All set. Thanks!");
					bird2.communicate();
					petShop.add(bird2);
				}

			} else if (operation == 1) { // Operation to REMOVE animal from the System.

				if (petShop.getListSize() == 0) {
					// Warns empty list
					System.out.println("There's no animal here right now.");
				} else {
					System.out.println("Select YOUR animal, selecting its position: ");
					petShop.listAll(); // Show the list of 'petShop':
					int animalIndex = scan.nextInt();
					petShop.remove(animalIndex);
				}

			}
			System.out.println("If you want to exit, digit FALSE");
			String continueString = scan.next();
			if (continueString.matches("[falseFALSE]+")) {
				System.out.println("See you another time!");
				wannnaAddNewAnimal = false;
				scan.close();
			}
		}
	}
}
