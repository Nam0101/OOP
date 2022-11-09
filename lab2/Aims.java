import java.util.*;
import java.lang.Math;

public class Aims {
	public static void main(String[] args) {

		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd1);
		boolean cont = true;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println(
					"1. Add DVD to card:\n2. Remove CD from card\n3. Display\n4. Total Cost\n5. Find CD by Cost");
			int cmd = input.nextInt();
			switch (cmd) {
				case 1:
					System.out.println("Enter title: ");
					Scanner titleStr = new Scanner(System.in);
					String title = titleStr.next();
					System.out.println("Enter category: ");
					Scanner categoryStr = new Scanner(System.in);
					String category = categoryStr.next();
					System.out.println("Enter director: ");
					Scanner directorStr = new Scanner(System.in);
					String director = directorStr.next();
					System.out.println("Enter length: ");
					Scanner lengthStr = new Scanner(System.in);
					int length = lengthStr.nextInt();
					System.out.println("Enter Cost:");
					Scanner costStr = new Scanner(System.in);
					float cost = costStr.nextFloat();
					DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
					anOrder.addDigitalVideoDisc(dvd);
					break;
				case 2:
					System.out.println("Enter title: ");
					Scanner titleStrRemove = new Scanner(System.in);
					String titleRemove = titleStrRemove.next();
					DigitalVideoDisc dvdRemove = anOrder.findByTitle(titleRemove);
					if (dvdRemove == null) {
						System.out.println("Not found DVD");
					} else {
						anOrder.removeDigitalVideoDisc(dvdRemove);
					}
					break;
				case 3:
					anOrder.display();
					break;
				case 4:
					System.out.println("Total Cost is: " + String.format("%.2f", anOrder.totalCost()));
					break;
				case 5:
					System.out.println("Enter min cost");
					Scanner sc = new Scanner(System.in);
					float minCost = sc.nextFloat();
					System.out.println("Enter max cost");
					float maxCost = sc.nextFloat();
					DigitalVideoDisc findByCostDsc = anOrder.findByCost(minCost, maxCost);
					if (findByCostDsc == null) {
						System.out.println("No DVD match");
					} else {
						System.out.println("Found DVD: ");
						System.out.println("Title:" + findByCostDsc.getTitle());
						System.out.println("category:" + findByCostDsc.getCategory());
						System.out.println("Cost:" + findByCostDsc.getCost());
					}
					break;
				case 6:
					System.out.println("Goodbye!");
					cont = false;
					break;
				default:
					System.out.println("Wrong cmd");
					break;
			}

		} while (cont);

	}

}
