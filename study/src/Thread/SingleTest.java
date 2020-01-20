package Thread;

public class SingleTest {
	public static void main(String[] args) {
		Single st1 = new Single("A작업", 100);
		Single st2 = new Single("A작업", 50);
		Single st3 = new Single("A작업", 10);
		
		st1.run();
		st2.run();
		st3.run();
		
		// 싱글 쓰레드
		// st1이 수행 완료 된 후 
		// st2, st3가 차례대로 수행, 완료
	}
}
