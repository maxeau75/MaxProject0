package base;

import java.util.Scanner;

public class User extends test{
	protected String userName;
	protected String password;
	protected String userRoles;
	
	public User(String un, String pw, String ur) {
		this.userName = un;
		this.password = pw;
		this.userRoles = ur;
	}
		
	public boolean authenticate(String un, String pw, String ur) {
		return un.equals(this.userName) && pw.equals(this.password) && ur.equals(this.userRoles);
	}

	
	public boolean hasPermission1() {
			
		return true;
	}

	public boolean hasPermission2() {
		return false;
	}

	
	public boolean hasPermission3() {
		return false;
	}
}

