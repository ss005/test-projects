class Car {
	String name = "i10";

	public void aMethod() {
		System.out.println("Car::aMethod");
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Car::toString";
	}
	
	public Engine getEngine() {
		System.out.println("Car::getEngine");
		//return new Car.Engine();
		//Car car = new Car();
		//return car.new Engine();
		return this.new Engine();
	}
	
	public Engine2 getEngine2() {
		System.out.println("Car::getEngine2");
		return new Car.Engine2();
	}
	
	
	///////////////////// Non-static nested class - inner class
	private class Engine {
		private int capacity = 1;
		public Engine() {
			System.out.println("Engine::constructor");
		}

		@Override
		public String toString() {
			System.out.println(super.toString());
			return "Engine::toString" + " " + name;
		}
	}


	//////////////////// static nested class
	public static class Engine2 {
		int capacity = 2;

		public Engine2() {
			System.out.println("Engine2::construcotr");
		}

		@Override
		public String toString() {
			return super.toString() + "Engine2::toString";
		}
	}


	////////////////// anonymous class

	public Car getAnonymous() {
		Car anon = new Car() {
			public void aMethod() {
				System.out.println("anonymous class::aMehthod " + Car.this.name );
			}
		};
		return anon;
	}

}

public class TestCar {
	public static void main(String[] args) {
		
		//inner class test
		System.out.println("+++ innner class test +++");
		Car car = new Car();
		//System.out.println(car);
		System.out.println(car.getEngine()); // if Engine is public insie Car public then car.new Engine();
	
		
		//static class test
		System.out.println();
		System.out.println("+++ static clas test +++");
		//System.out.println(new Car.Engine2());
		System.out.println(car.getEngine2());
		
		//anonymous class test
		System.out.println();
		System.out.println("+++ anonymous class test"); 
		car.getAnonymous().aMethod();

	}
}