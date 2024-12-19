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
		
		/*
		 * 	단항 연산자		항이 한 개인 연산자		++num
		 * 	이항 연산자		항이 두 개인 연산자		num1+num2;
		 * 	삼항 연산자		항이 세 개인 연산자		(5>3) ? 1 : 0;
		 * 
		 * 	대입 연산자		외쪽 변수 = 오른쪽 변수(또는 식)
		 * 		int age = 24;
		 * 		totalScore = mathScore + engScore;
		 * 
		 * 	부호 연산자
		 * 		+		변수나 상수 값을 양수로 만듬
		 * 		-		변수나 상수 값을 음수로 만듬
		 */
		int Num7  = 10;
		System.out.println(+Num7);	//값이 10이 그대로 출력
		System.out.println(-Num7);	//값에 -가 붙어서 출력되지만 음수로 바뀌는것은 아님
		System.out.println(Num7);	//값이 그대로 출력됨
		
		Num7 = -Num7;				//Num7값을 음수로 변경
		System.out.println(Num7);	//값 -10(음수)가 출력됨
		
	}

}
