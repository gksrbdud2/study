package Thread;

public class Single {
	private String name;
	private int num;

	public Single(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	void run() {
		for(int i=1; i<=num; i++) {
			System.out.println(name+", "+i);
		}
	}
}
