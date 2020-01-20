package Thread;

public class Multi2 extends A implements Runnable {
	private String name;
	private int num;

	public Multi2(String name, int num) {
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
