package Thread;

public class SingleTest {
	public static void main(String[] args) {
		Single st1 = new Single("A�۾�", 100);
		Single st2 = new Single("A�۾�", 50);
		Single st3 = new Single("A�۾�", 10);
		
		st1.run();
		st2.run();
		st3.run();
		
		// �̱� ������
		// st1�� ���� �Ϸ� �� �� 
		// st2, st3�� ���ʴ�� ����, �Ϸ�
	}
}
