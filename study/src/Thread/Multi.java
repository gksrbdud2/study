package Thread;

public class Multi extends Thread {	//��Ƽ������� ThreadŬ���� ���
	private String name;
	private int num;

	public Multi(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	//run() �޼��� �������̵�
	//������ �� ������ run() �޼��忡 �ۼ�
	@Override //�ܼ��� �ּ��Ӹ� �ƴ϶� üŷ ��ɱ��� �����ϰ� ����?
	public void run() {
		for(int i=1; i<=num; i++) {
			System.out.println(name+", "+i);
		}
	}
}
