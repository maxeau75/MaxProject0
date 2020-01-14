package base;

public class Admin extends User{
	/**
	 * @param un Username
	 * @param pw Password
	 * @param ur UserRoles
	 */
	public Admin(String un, String pw, String ur) {
		super(un, pw, ur);
	}

	@Override
	public boolean hasPermission1() {
		return true;
	}

	@Override
	public boolean hasPermission2() {
		return true;
	}

	@Override
	public boolean hasPermission3() {
		return true;
	}

}
