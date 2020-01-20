package Thread;

public class MultiTest {
	public static void main(String[] args) {
		Multi t1 = new Multi("A작업", 20);
		Multi t2 = new Multi("B작업", 50);
		Multi t3 = new Multi("C작업", 10);
		
		//실행시 run() 메서드 사용하면 X
		//start() 메서드 사용 필수
		t1.start();
		t2.start();
		t3.start();
	}
}
