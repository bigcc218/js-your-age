import java.util.Scanner;
public class Age{
	public static void main(String[] args){
		//�½���׼����
		Scanner sc = new Scanner(System.in);
		
		
		//���ܣ�������������
		/*
		��ȡ��ǰ��ݽ�������m1��
		��ȡ��ĳ�����ݽ�����"m2"
		��������������Ϊ"m3"
		�Ѻ�����ʾ
		*/
		
		
		//��ȡ��Ϣ
		System.out.print("��¼�뵱ǰ��ݣ�");
		int m1 = sc.nextInt();
		System.out.print("��¼����ĳ������ڣ�");
		int m2 = sc.nextInt();
		
		
		//��ʼ����
		int m3 = m1-m2;
		
		
		//���������û�
		System.out.println("��������Ϊ��"+m3);
	}
}