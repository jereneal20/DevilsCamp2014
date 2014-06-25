import java.util.Random;

public class Meyou {
	public static int MAX_FLOOR = 6;
	public static int MAX_WEIGHT = 200;
	public static int LOOP_COUNT = 30;
	public static int EMERGENCY_RATE = 10;
	
	
	public static void main(String[] args) {
		Random random = new Random();
		
		Person[] people = {
			new Person("조영준", random.nextInt(100) + 1),
			new Person("최다인", random.nextInt(100) + 1),
			new Person("안혁준", random.nextInt(100) + 1),
			new Person("신형준", random.nextInt(100) + 1),
			new Person("김태진", random.nextInt(100) + 1),
			new Person("이원준", random.nextInt(100) + 1),
			new Person("김승태", random.nextInt(100) + 1)
		};
		
		Elevator elevator = new Elevator(MAX_FLOOR, MAX_WEIGHT);
		
		for (int i = 0; i < LOOP_COUNT; i++) {
			elevator.setGateStatus(random.nextBoolean());
			elevator.enter(people[random.nextInt(people.length)]);
			elevator.leave(people[random.nextInt(people.length)]);
			elevator.move(random.nextInt(MAX_FLOOR));
			if (random.nextInt(100) < EMERGENCY_RATE) {
				elevator.emergency("PLZ SAVE ME");
			}
			elevator.printInfo();
		}

	}

}
