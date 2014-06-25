import java.util.ArrayList;

public class Elevator {
	private int maxFloor;
	private int currentFloor;
	private int maxLoad;
	private boolean open;
	
	private ArrayList<Person> passengers;
	
	public Elevator(int maxFloor, int maxLoad) {
		// 해당 class 초기화
	}
	
	public void move(int floor) {
		// 1층 ~ maxFloor로 이동
	}
	
	public void enter(Person person) {
		// 전체 탑승객 + 새로운 탑승객의 무게가 maxLoad를 넘지 않고, 열려있으면 탑승
		int curWeight = 0;
		
		for(int i = 0 ; i< passengers.size() ; i++){
			curWeight += passengers.get(i).getWeight();
			curWeight += person.getWeight();
		}
		if(curWeight > maxLoad){
			System.out.println("cannot enter the Elevator - Full weight");
			curWeight -= person.getWeight();
			System.exit(0);
		}
		if(open == false){
			System.out.println("cannot enter the Elevator - door close");
			System.exit(0);
		}
		
		System.out.println("Enter success");
		passengers.add(person);
		
	}
	
	public void leave(Person person) {
		// 열려있고, person이 있으면 내림
	}
	
	public void setOpen(boolean open) {
		// 문의 열린 상태 변경
	}
	
	public void emergency(String message) {
		// ????
	}
	
	public void printInfo() {
		// 엘리베이터의 상태(층, 탑승객, 등) 출력
	}
}