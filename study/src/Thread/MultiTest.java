package Thread;

public class MultiTest {
	public static void main(String[] args) {
		Multi t1 = new Multi("A�۾�", 20);
		Multi t2 = new Multi("B�۾�", 50);
		Multi t3 = new Multi("C�۾�", 10);
		
		//����� run() �޼��� ����ϸ� X
		//start() �޼��� ��� �ʼ�
		t1.start();
		t2.start();
		t3.start();
	}
}
