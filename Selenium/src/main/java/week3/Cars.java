package week3;

public class Cars extends Vehicle {
	String brand;
	String Regnumber;
	String Model;
	String carType;


Cars(){
	System.out.println(this.getClass().getSimpleName());
}

//Method
public String Type (String carType) {
	return carType;
	
}
public void Model (String Model) {
	System.out.println("Model");
}
public void Regnumber (String Regnumber) {
	System.out.println("Regnumber");
}
public void Brand (String brand) {
	System.out.println("brand");
}
}
