/*==============================
  ����  ������ �ڷ��� ����
   - �� ��ȯ / ���̻� Ȱ��
===============================*/

public class Test006
{
	public static void main(String[] args)
	{
		
		int a;
		a = 10;
		System.out.println(" a�� ��� : " + a);
		//--==>> a�� ��� : 10 

		int b= 20;
		System.out.println(" b�� ��� : " + b);
		//--==>> b�� ��� : 20 

		short c;

		// ���� �� ó�� (���� ����)
		//c = a;
		//--==>> ���� �߻�(������ ����)
		// -- �⺻������ �ڷ����� ���� �Ϳ� ū ���� ���� ���Ѵ�. 
		//    (�ڵ� �� ��ȯ ��Ģ ����~!!)
		
		// �������� �� ��ȯ (���� �� ��ȯ)
		c = (short)a;
		// -- a �� ������ �ִ� �����͸� short ������ �� ��ȯ�� ������ �� 
		//		���� c�� �����Ѵ�. 
		// 0000000 00000000 00000000 00001010  �� int �� a ���� 10
		//		    ���� ��ȯ 		
		//  00000000 00001010				   �� short �� a ���� 10

		// ��� ��� 
		System.out.println(" c�� ��� : "+ c);
		//--==>> c�� ��� :10

		//���� ���� �� �ʱ�ȭ 
		//int d = 10000000000;  //���
		//--==>> ���� �߻� (������ ����)


		//long d = 10000000000;   //���
		//--==>> ���� �߻� (������ ����)				
		
		long d = 10000000000L;   //���
		//-- ���̻� ��L���� �߿��ϴ�
		//	 long�� ����(���)�ڿ� ��L���Ǵ� ��l���� �ٿ�
		//	 ����� ǥ���ؾ��Ѵ�. 
		//	 ��, �� 21�� �̻� �Ǵ� ���� ������ �������
		//	 ������ �ڿ� ���̻縦 �� �ٿ��� �� �ֵ��� �Ѵ�. 



		//��� ��� 
		System.out.println(" d�� ��� : " + d);
		// --==>> d�� ��� : 10000000000

		//���� ���� �� �ʱ�ȭ 
		int e = 030;

		//��� ���
		System.out.println(" e�� ��� : " + e);
		//--==>> e�� ��� : 24
		//-- ���λ� ��0�� �� 8���� 
		
		//���� ���� �� �ʱ�ȭ
		int f= 0xa6;
		
		//��� ��� 
		System.out.println(" f�� ��� : " + f);
		// --==>>  f�� ��� : 166
		// -- ���λ硺0x�� �� 16����

		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		//					    a  b  c  d  e  f


		// ���� ���� �� �ʱ�ȭ
		//float g = 0;
		//float g = 0.0;
		float g = 0.0f;

		// ��� ���
		System.out.println(" g�� ��� : " + g);
		//--==>>  g�� ��� : 0.0
	

	}
}

//���� ���
/*
 a�� ��� : 10
 b�� ��� : 20
 c�� ��� : 10
 d�� ��� : 10000000000
 e�� ��� : 24
 f�� ��� : 166
 g�� ��� : 0.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/