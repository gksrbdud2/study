package Thread;

public class MultiTest2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Multi2("A작업", 20));
		Thread t2 = new Thread(new Multi2("B작업", 10));
		Thread t3 = new Thread(new Multi2("C작업", 50));
		
		//실행시 run() 메서드 사용하면 X
		//start() 메서드 사용 필수
		t1.start();
		t2.start();
		t3.start();
	}
}
