package kr.co.na.JavaEduHome;

public class IntegerVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
		int iNum3 = 10;
		byte bNum2 = (byte)iNum3;	//����Ʈ ũ�Ⱑ ū �ڷ������� ���� �ڷ������� �����ϴ°�� ��������Ȱ ���� ��ȣ�� �Ἥ ����ؾ��Ѵ�.
		
		double dNum1 = 3.14;
		int iNum4 = (int)dNum1;
		System.out.println(iNum4);
		
		char ch1 = 'A';
		System.out.println((int)ch1);
		
		int ch2 = 67;
		System.out.println((char)ch2);
		
		System.out.println('\n');
		
		double dNum2 = 1.2;
		float fNum1 = 0.9F;
		
		int iNum5 = (int)dNum2 + (int)fNum1;	//�� �Ǽ��� ���� ����ȭ �Ǿ� ������
		int iNum6 = (int)(dNum2 + fNum1);		//�� �Ǽ��� ������ ���� ����ȯ�� ��
	
		System.out.println(iNum5);
		System.out.println(iNum6);
		
		/*
		 * 	���� ������		���� �� ���� ������		++num
		 * 	���� ������		���� �� ���� ������		num1+num2;
		 * 	���� ������		���� �� ���� ������		(5>3) ? 1 : 0;
		 * 
		 * 	���� ������		���� ���� = ������ ����(�Ǵ� ��)
		 * 		int age = 24;
		 * 		totalScore = mathScore + engScore;
		 * 
		 * 	��ȣ ������
		 * 		+		������ ��� ���� ����� ����
		 * 		-		������ ��� ���� ������ ����
		 */
		int Num7  = 10;
		System.out.println(+Num7);	//���� 10�� �״�� ���
		System.out.println(-Num7);	//���� -�� �پ ��µ����� ������ �ٲ�°��� �ƴ�
		System.out.println(Num7);	//���� �״�� ��µ�
		
		Num7 = -Num7;				//Num7���� ������ ����
		System.out.println(Num7);	//�� -10(����)�� ��µ�
		
	}

}
