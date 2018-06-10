package week3;

public class Vehicle {
	String type;
	String Model;
	int wheels;
	String Regnumber;

  Vehicle() {
	  System.out.println(this.getClass().getSimpleName());
		
		wheels=4;
		Regnumber="TN45AED45";
		}
	public String Type (String type) {
		type="Car";
		System.out.println(type);
		return type;
		}
	
	public void Model (String Model) {
		Model="Car";
		System.out.println(type); 
	
	}
	public void wheels (int wheels) {
		wheels=4; 
		System.out.println(wheels);
	
	}
	public void Regnumber (String Regnumber) {
		Regnumber="TN45AED45"; 
		System.out.println(Regnumber);
	
	}

}
