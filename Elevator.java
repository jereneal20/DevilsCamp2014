import java.util.ArrayList;

public class Elevator {
	private int maxFloor;
	private int currentFloor;
	private int maxLoad;
	private boolean gateOpen;

	private ArrayList<Person> passengers;

	public Elevator(int maxFloor, int maxLoad) {
		// 해당 class 초기화
	}

	public void move(int floor) {
		// 1층 ~ maxFloor로 이동
	}

	public void enter(Person person) {
		// 전체 탑승객 + 새로운 탑승객의 무게가 maxLoad를 넘지 않고, 열려있으면 탑승
	}

	public void leave(Person person) {
		// 열려있고, person이 있으면 내림
	}

	public void setGateStatus(boolean open) {
		this.gateOpen = open;
		System.out.println("드루와 드루와!!");
		// 문의 열린 상태 변경
	}

	public void emergency(String message) {
		System.out.println(message);
		// TODO
	}

	public void printInfo() {
		System.out.println("Current Floor : " + currentFloor);
		for (int i = 0; i < passengers.size(); i++) {
			System.out.print(passengers.get(i).getName() + " ");
		}
		System.out.println("\n");
		// 엘리베이터의 상태(층, 탑승객, 등) 출력
	}
}