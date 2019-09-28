package animals;

public class Main {

	public static void main(String[] args) {
		
		// Creating objects:
		Cachorro dog1 = new Cachorro();
		dog1.nameString = "Bruto";
		dog1.numberOfPaws = 4;
		Gato cat1 = new Gato();
		cat1.nameString = "Frajola";
		cat1.numberOfPaws = 4;
		Passaro bird1 = new Passaro();
		bird1.nameString = "Donald";
		bird1.numberOfPaws = 2;
		
		// Testing previous created obj:
		dog1.communicate();
		dog1.sleep();
		cat1.communicate();
		cat1.eat();
		bird1.communicate();
		bird1.move();
		
		// Testing toString()
		System.out.println(dog1.toString());
		
		// Testing 'AnimalsCollections':
		AnimalsCollection col1 = new AnimalsCollection();
		col1.add(dog1);
		col1.add(bird1);
		col1.getListSize();
		// Shows the collection before & after using 'remove()':
		col1.remove(dog1);
		col1.getListSize();
		col1.add(dog1);
		col1.add(cat1);
		// Get list items:
		col1.listAll();
	}
}
