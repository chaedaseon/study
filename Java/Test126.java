/*============================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
==============================================*/

/*
 �� ����
	�Ϲ������� Ŭ������ �ϳ��� ������ ���� �ƴ϶�
	���� ������ Ŭ������ ���� �� ��� ����ϰ� �Ǵµ�
	�̷��� Ŭ������ �������̽� ������ ��Ű��(package)��� �Ѵ�.
	sun(Oracle)�翡���� �ڹ����α׷��� 
	ȿ�������� �ۼ��� �� �ֵ��� �ڹ� ǥ�� ��Ű���� �����ϸ�
	�ڹ� ǥ�� ��Ű������ �׷��� ��Ʈ��ũ �����ͺ��̽� ����
	�پ��ϰ� ������ Ŭ�������� ���ԵǾ� �ִ�.

 �� import ����
	
	�ڹ� ǥ�� ��Ű���� ����ڿ� ���� ������� ��Ű���� 
	����ϱ����ؼ��� �������� �����ϱ⿡ �ռ� ���α׷��� ���Խ�Ű�� 
	������ �ʿ��ѵ�. �� �� ��import������ �̿��Ͽ� ��Ű�� �Ǵ� 
	Ŭ������ ���α׷��� ���Խ�Ű�� �ȴ�.
	������ ��java.lang.*����Ű���� �ڹ� ���α׷��� �⺻������ 
	import�Ǿ� �ֱ� ������ �� ��Ű���� Ŭ�������� import���� �ʰ�
	�ٷ� ����ϴ� ���� �����ϴ�.

	import���� �ݵ�� Ŭ���� ���� �������� ����Ǿ� �־�� �ϸ�
	������ ������ ���� �ΰ����� �ִ�.

	import [static]��Ű��. Ŭ���� ;
	import [static]��Ű��.*;

	�� JDK1.5 ���ʹ� import �� ������ ��static�� Ű���带 ����� �� �ְ� �Ͽ���
	�������� ��Ű���� import �� �� �մ� ����� �����ϰ� �Ǿ���
	���� ��Ű���� �������� import�� ����� ��� ���� ������ 
	�޼ҵ�� ��� �������� ���λ�(ex �� ob, br, sc ó��...)�� ������ �ʰ�
	����ϴ� ���� �����ϴ�.

 �� Object Ŭ���� 
	��java.lang.Object��Ŭ������ �ڹ� Ŭ������ �ֻ��� Ŭ������ 
	�ڹ� ǥ�� ��Ű���� Ŭ������ ����ڿ� ���� �ۼ��� ��~~~~~~~�� Ŭ������
	�⺻������ �� Ŭ�����κ��� ��� �޴´�
	����, �ڹ��� ��� Ŭ������ ��java.lang.Object��Ŭ������ 
	�޼ҵ带 ������ ������, �ٷ� ����ϴ� ���� �����ϴ�.
*/

//import java.lang.*;

public class Test126 //extends Object
{

	/*
	Object Ŭ�����κ��� ��ӹ��� �����
	...
	...

	.....toString()
	{
		...;
	
	}
	
	*/
		
	
	

	public static void main(String[] args)
	{
		Test126 ob = new Test126();

		// ��ü.xxx();
		//-- �ش� ��ü�� ������Ű�µ� ���� Ŭ������ �޼ҵ� xxx() ȣ��

		// Clrcle ob = new Clrcle();
		// ob.input();
		// -- ob ��ü�� ������Ű�µ� ���� Ŭ���� �� Clrcle
		//	Clrcle Ŭ������ ���ǵǾ� �մ� input() �޼ҵ� ȣ��

		// ��ü.yyy();
		//-- �ش� ��ü�� ������Ű�µ� ���� ��� Ŭ������ 
		//   yyy() �޼ҵ尡 �������� ���� ��...
		//   --==>> ���� �߻� (������ ����)

		//System.out.println(ob.acttion());
		//--==>> ���� �߻�(������ ����)
		//		 cannot find sympol
		// -- ob ��ü�� ������Ű�µ��� ���� Test12 Ŭ������
		//	  acttion() �޼ҵ尡 �������� �ʱ� ������ ���� �߻��ϴ� ��Ȳ

		System.out.println(ob.toString());
		//--==>> Test126@15db9742
		//-- �޸� �ּҰ� �ƴ϶�
		//	 �ڹٰ� ��ü�� �����ϱ� ���� ���Ƿ� �ο��ϴ� �ĺ� ��ȣ
		//-- Test126 Ŭ������ toString()�޼ҵ尡 �������� �������� �ұ��ϰ�
		//   ������ �߻����� �ʴ� ��Ȳ
		//	 �� Object�� ���� ��� ����~~!!
		// �Ű������� String�� �Ѱ���

		System.out.println(ob);
		//--==>> Test126@15db9742
		// �Ű������� Object�� �Ѱ���

	}
}