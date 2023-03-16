package exceptions;

public class InstanceNotFoundException extends Exception {

	private String className;

	public InstanceNotFoundException(String className) {
		super();
		this.className = className;
		// TODO Auto-generated constructor stub
	}

}
