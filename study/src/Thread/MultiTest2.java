package Thread;

public class MultiTest2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Multi2("A�۾�", 20));
		Thread t2 = new Thread(new Multi2("B�۾�", 10));
		Thread t3 = new Thread(new Multi2("C�۾�", 50));
		
		//����� run() �޼��� ����ϸ� X
		//start() �޼��� ��� �ʼ�
		t1.start();
		t2.start();
		t3.start();
	}
}
