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
		byte bNum2 = (byte)iNum3;	//바이트 크기가 큰 자료형에서 작은 자료형으로 대입하는경우 강제형변활 형을 괄호를 써서 명시해야한다.
		
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
		
		int iNum5 = (int)dNum2 + (int)fNum1;	//두 실수가 각각 형변화 되어 더해짐
		int iNum6 = (int)(dNum2 + fNum1);		//두 실수가 합해진 다음 형변환이 됨
	
		System.out.println(iNum5);
		System.out.println(iNum6);
		
		
		
	}

}
