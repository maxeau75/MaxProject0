package Cars;

public class Car implements Serializable {
	String VIN;
	String make;
	String model;
	int year;
	int mileage;
	float price;

	Car() {
	}; // default constructor

	public Car(String VIN, String make, String model, int year, int mileage, float price) {
		this.VIN = VIN;
		this.make = make;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
		this.price = price;
	}

	public boolean addNewCar(String VIN, String make, String model, int year, int mileage, float price) {
		this.VIN = VIN;
		this.make = make;
		this.model = model;
		this.year = year;
		this.mileage = mileage;
		this.price = price;
		return true;
	}

	//All the getter are saved here
	public String getVIN() {
		return VIN;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public int getMileage() {
		return mileage;
	}

	public float getPrice() {
		return price;
	}

}
