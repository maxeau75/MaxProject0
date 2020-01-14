package base;

import java.util.Scanner;

import Cars.CarDealership;

public class User extends Cars.CarDealership{
	protected String userName;
	protected String password;
	protected String userRoles;
	
	/**
	 * @param un Username
	 * @param pw Password
	 * @param ur UserRoles
	 */
	public User(String un, String pw, String ur) {
		this.userName = un;
		this.password = pw;
		this.userRoles = ur;
	}

	/**
	 * @param un Username
	 * @param pw Password
	 * @param pw Role
	 * @return <b>true</b> if correct account, <b>false</b> otherwise
	 */
	public boolean authenticate(String un, String pw, String ur) {
		return un.equals(this.userName) && pw.equals(this.password) && ur.equals(this.userRoles);
	}

	/**
	 * @return true
	 */
	private static Scanner sc = new Scanner(System.in);
	CarDealership cd = new CarDealership();
	
	public boolean hasPermission1() {
		displayMenu1();
		
		return true;
	}

	/**
	 * @return false
	 */
	public boolean hasPermission2() {
		return false;
	}

	/**
	 * @return false
	 */
	public boolean hasPermission3() {
		return false;
	}

}
