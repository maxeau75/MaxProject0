package base;

import java.lang.reflect.Array;
import java.util.Scanner;

public class test 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Max Car Dealership.");
		System.out.println("");
					
		User[] users = new User[] {new User("MExil_Customer","Password123","1"),new Admin("MExil_Emplyoyee","Password123","2")};
 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username = in.nextLine();
		System.out.println("Enter Password:");
		String password = in.nextLine();
		System.out.println("Please enter your role:");
		System.out.println("Enter 1 for customer or 2 for employee");
		String roles = in.nextLine();
		
		if (roles.equals("1"))
		{
			for(User user:users) {
				if(user.authenticate(username, password, roles)) {
					System.out.println("As a customer, I can view the cars on the lot:  "+user.hasPermission1());
					//System.out.println("Privilege #2: "+user.hasPermission2());
					//System.out.println("Privilege #3: "+user.hasPermission3());
					break;
				}
			}
		}
		
		else if (roles.equals("2"))
		{
		for(User user:users) {
			if(user.authenticate(username, password, roles)) {
				System.out.println("Privilege #1: "+user.hasPermission1());
				System.out.println("Privilege #2: "+user.hasPermission2());
				System.out.println("Privilege #3: "+user.hasPermission3());
				break;
				}
			}
		}
 
		
		in.close();

	}

}
