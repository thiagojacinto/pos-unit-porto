package activity08;

public class Manager implements Auth {
	private int password;

	@Override
	public boolean verifyPassword() {
		// TODO Auto-generated method stub
		if (this.password == Auth.password) {
			return true;
		} else {
			return false;
		}
	}
	
	public void setPassword(int password) {
		this.password = password;
	}
	
	
}
