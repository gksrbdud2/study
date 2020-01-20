package Thread;

public class Multi extends Thread {	//멀티쓰레드는 Thread클래스 상속
	private String name;
	private int num;

	public Multi(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	//run() 메서드 오버라이딩
	//쓰레딩 할 내용을 run() 메서드에 작성
	@Override //단순한 주석뿐만 아니라 체킹 기능까지 포함하고 있음?
	public void run() {
		for(int i=1; i<=num; i++) {
			System.out.println(name+", "+i);
		}
	}
}
