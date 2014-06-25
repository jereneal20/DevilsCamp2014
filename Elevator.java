import java.util.ArrayList;

public class Elevator {
	private int maxFloor;
	private int currentFloor;
	private int maxLoad;
	private boolean gateOpen;

	private ArrayList<Person> passengers;

	public Elevator(int maxFloor, int maxLoad) {
		// 해당 class 초기화
		this.passengers = new ArrayList<Person>();
		this.maxFloor = maxFloor;
		this.maxLoad = maxLoad;
		this.gateOpen = false;
		this.currentFloor = 1;
	}

	public void move(int floor) {
		// 1층 ~ maxFloor로 이동
		if (floor <= maxFloor && floor > 0) {
			this.currentFloor = floor;
		} else
			System.out.println("그런 층 없습니다.");
	}

	public void enter(Person person) {
		// 전체 탑승객 + 새로운 탑승객의 무게가 maxLoad를 넘지 않고, 열려있으면 탑승
		int curWeight = 0;

		for (int i = 0; i < passengers.size(); i++) {
			curWeight += passengers.get(i).getWeight();
			curWeight += person.getWeight();
		}
		if (curWeight > maxLoad) {
			System.out.println("cannot enter the Elevator - Full weight");
			curWeight -= person.getWeight();
			System.exit(0);
		}
		if (gateOpen == false) {
			System.out.println("cannot enter the Elevator - door close");
			System.exit(0);
		}

		System.out.println("Enter success " + person.getName());
		passengers.add(person);

	}

	public void leave(Person person) {
		// 열려있고, person이 있으면 내림
	}

	public void setOpen(boolean Open) {
	}

	public void setGateStatus(boolean open) {
		// 문의 열린 상태 변경
		this.gateOpen = open;
		if (this.gateOpen == true) {
			System.out.println("드루와 드루와!!");
		} else {
			System.out
					.println("Please Press the open butten. Now this gate is closed");
		}
	}

	public void emergency(String message) {
		// ????
	}

	public void printInfo() {
		// 엘리베이터의 상태(층, 탑승객, 등) 출력
		System.out.println("Current Floor : " + currentFloor);
		for (int i = 0; i < passengers.size(); i++) {
			System.out.print(passengers.get(i).getName() + " ");
		}
		if (passengers.size() > 1) {
			System.out.println("\n");
		}
	}
}
