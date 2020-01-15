package base;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Cars.Car;
import Cars.CarDealership;

public class test extends CarDealership {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		User[] users = new User[] { new User("Maxeau_Exil"+ "", "Password123", "1"),
				new Admin("Christopher_Gibs", "Password123", "2") };

		String user, pass, roles;

		ArrayList<Car> cars = new ArrayList<>();
		Car newCar = new Car("536212", "Crysler", "X100", 2015, 86545, 85647.00F);
		cars.add(newCar);
		cars.add(new Car("785537", "Mercedez", "ML 350", 5150, 65452, 45000.00F));
		cars.add(new Car("548566", "Toyota", "Carolla", 2000, 5000, 19000.00F));
		cars.add(new Car("422345", "BMW", "X5", 2010, 15000, 1900.00F));
		cars.add(new Car("345681", "Toyota", "Camry", 2000, 5000, 1900.00F));
		cars.add(new Car("546798", "Lexus", "ES300", 2002, 4000, 1900.00F));
		cars.add(new Car("907856", "Buick", "Encore", 2020, 5000, 40000.00F));

		new FileOutputStream("C:\\Users\\maxea\\Documents\\JavaTraining\\Test\\src\\myTest\\output.txt", true).close();
				
		int menuOption = 0;

		System.out.println("Enter Username:");
		user = sc.nextLine();
		System.out.println("Enter Password:");
		pass = sc.nextLine();
		System.out.println("Please enter your role:");
		System.out.println("Enter 1 for customer or 2 for employee");
		roles = sc.nextLine();

		if (roles.equals("1")) {
			System.out
					.println("Welcome to Maxeau Dealership please pick from the following options (Press 0 for menu)");
			System.out.println(user + ": You are login as a customer.");
			System.out.println("");

			displayMenu1();
			do {
				System.out.println("\n\nWhat would you like to do? (0 for main menu)");
				menuOption = sc.nextInt();
				while (menuOption < 0 || menuOption > 6) {
					System.out.println("Please enter a correct menu option.(0 to see the menu)");
					menuOption = sc.nextInt();
				}
				doMenuOption1(menuOption, cars);

			} while (menuOption != 6);

			FileOutputStream fos = new FileOutputStream("C:\\Users\\maxea\\Documents\\JavaTraining\\CarDealershipApp\\src\\Cars\\myCars.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Car car : cars) {
				oos.writeObject(car);
			}
			fos.close();
		}

		else if (roles.equals("2")) {
			System.out
					.println("Welcome to Maxeau Dealership please pick from the following options (Press 0 for menu)");
			System.out.println(user + ": You are login as a employee.");
			System.out.println("");

			displayMenu2();
			do {
				System.out.println("\n\nWhat would you like to do? (0 for main menu)");
				menuOption = sc.nextInt();
				while (menuOption < 0 || menuOption > 6) {
					System.out.println("Please enter a correct menu option.(0 to see the menu)");
					menuOption = sc.nextInt();
				}
				doMenuOption2(menuOption, cars);

			} while (menuOption != 6);

			FileOutputStream fos = new FileOutputStream("C:\\Users\\maxea\\Documents\\JavaTraining\\Test\\src\\myTest\\output.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Car car : cars) {
				oos.writeObject(car);
				
			}
			
			fos.close();
		}

		sc.close();

	}

}
