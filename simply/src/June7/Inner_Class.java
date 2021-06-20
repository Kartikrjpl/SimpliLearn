package June7;

class Car {
	String carName;
	String carType;
	
	public Car(String carName, String carType) {
		this.carName = carName;
		this.carType = carType;
	}
	
	private String getCarName() {
		return this.carName;
	}
	
	class Engine{
		String engineType;
		
		void setEngine(){
			
			if(Car.this.carType.contentEquals("4WD")) {
				
				if(Car.this.getCarName().equals("Crysler")){
					this.engineType = "Smaller";
				}
				else {
					this.engineType = "Bigger";
				}
			}
			else {
				this.engineType = "Bigger";
			}
		}
		
		String getEngineType() {
			return this.engineType;
		}
	}
}
public class Inner_Class {
	public static void main(String[] args) {
		Car c1 = new Car("Crysler", "8WD");
		Car.Engine engine = c1.new Engine();
		engine.setEngine();
		System.out.println("Engine type is "+engine.getEngineType());
	}
}
