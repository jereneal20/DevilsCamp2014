public class Person {
	private String name;
	private int weight;
	
	public Person(String name, int weight) {
		// 이름과 무게를 설정
	}
	
	public String getName() {
		return name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String toString() {
		return name + " / " + weight + "kg";
	}
}