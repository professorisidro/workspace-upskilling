package core;

public class CarFactory {
	public Car createNewCar(CarType type) {
		switch (type) {
		case COMPLETE:
			return new Car(1, "Porxe", 2600000);
		case ZERO_PRICE:
			return new Car(1, "Porxe", 0); 
		default:
			return null;
		}
	
	}
}
