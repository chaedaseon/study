/*==================================
   ���� Ŭ������ �ν��Ͻ� ����
   - Ŭ���� ����
   - �迭�� Ȱ��
   - ���������������� ��������
  =================================*/

  // ����ڷκ��� ��, ��, ���� �Է¹޾�
  // �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
  // ��, �޷� Ŭ����(Calender)�� ������� �ʴ´�.
  // ���� Ŭ������ ������ Ȱ���Ͽ� �ۼ� �� �� �ֵ��� �Ѵ�.
  // (��weekDay Ŭ���� ����)
  // �׸���, �迭�� ���䵵 ������� �ۼ� �� �� �ֵ��� �Ѵ�.
  // ���������������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
  
  // ����������..
  // WeekDay Ŭ���� ���踦 ���� 
  // Test099 Ŭ������ main() �޼ҵ尡 ���������� ���α׷� ����� �� �ֵ��� �Ѵ�.

  // ���� ��)
  // �� �� �� �Է�(���鱸��) : 2023 9 7
  // >> 2023�� 9�� 7�� �� �����
  // ����Ϸ��� �ƹ� Ű�� ��������...
  
  // �� Hint
  //    - 1�� 1�� 1�� �� "������"
  //	- 1���� 365���� �ƴϴ�. 
  //	  + 2���� ������ ��¥�� 29�� �� ����
  //	  + 2���� ������ ��¥�� 28�� �� ���
  //	- ���� �Ǻ� ����
  //	  �⵵�� 4�� ����̸鼭 100�� ����� �ƴϰų�,
  //	  400�� ����̸� ����, ���̿��� �⵵�� ���

import java.util.Scanner;

class WeekDay
{
	// �迭 ���� �� �޸� �Ҵ�
	String[] arr = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
	int[] dayArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int year,month,day;
	int sum=0;


	// ����ڷκ��� �� �� ���� �޴� �޼ҵ� ����	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �� �Է�(���� ����) : "); 
		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
	}

	// ���ذ� �������� �ƴ��� �Ǻ��ϱ� ���� ���
	// ������ 4�� ����̸�, 400�� ����̴�. ��, 100�� ����� ����̴�.
	void calYear()	
	{
		if (year%4==0 && year%100!=0)			
		{
			dayArr[1]=29;
		}
		else if (year%400==0)
		{
			dayArr[1]=29;
		}
		else if(year%4!=0)
		{
			dayArr[1]=28;		
		}
			
	}

	//���ر��� �־��� ���� Ƚ��
	int Count()
	{
		int count=0;
		
		// �����϶� count ++;
		for (int i=1; i<year; i++ )
		{
			if (i%4==0 && i%100!=0)		
				count ++;
			else if (i%400==0)
				count++;
		}

		return count;
	}


	// ���ݱ��� �ϼ� ���ϱ�
	int calDay(int a)
	{	
		//�۳� *365
		sum = (year-1) * 365;
		
		//�̹��� �����ϰ� ���ϱ�
		for (int i=0; i<month-1; i++)
		{
		 sum += dayArr[i];
		}
		// ���� ���ϱ�
		sum += day;
		// ���� Ƚ�� ���ϱ� 
		sum += a;
		return sum;
	}


	int data(int aa)
	{
		// ���ݱ��� ���� �� % 7 �� ����
		return aa%7;
	}


	void print(int i)
	{	
		// �� �� �� sum ��� �׽�Ʈ
		//System.out.printf("%d , %d , %d , %d , %d" , year, month, day, a, co);
		
		//�� �� �� ����
		System.out.println(" >> " + year + "��" + month + "��" + day + "��" + " �� " + arr[i]);
	}

}




public class Test099
{
	public static void main(String[] args)
	{
		//WeekDay Ŭ���� �ν��Ͻ� ����
		WeekDay ob = new WeekDay();

		// ����ڷκ��� �Է� �� �ޱ�
		ob.input();

		// ���ذ� �������� �ƴ��� Ȯ��
		ob.calYear();
		
		// ��¥ ����ϱ�
		int i = ob.data(ob.calDay(ob.Count()));

		// ��ü ��� ����ϱ�
		ob.print(i);
	}
}

//���� ���
/*

�� �� �� �Է�(���� ����) : 2023 09 07
 >> 2023��9��7�� �� �����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� �� �� �Է�(���� ����) : 1998 05 28
 >> 1998��5��28�� �� �����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/