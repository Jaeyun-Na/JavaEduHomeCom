package kr.co.na.JavaEduHome;

public class OperationEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 	산술 연산자
		 * 
		 * 	+	두 항을 더함								5+3
		 * 	-	앞에있는 항에서 뒤에 항을 뻄					5-3
		 * 	*	두 항을 곱함								5*3
		 * 	/	앞에있는 항에서 위에있는 항을 나누어 몫을 구함		5/3
		 * 	%	앞에있는 항에서 위에있는 항을 나누어 나머지을 구함	5%3
		 * 
		 * 
		 */
		
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;	//합계
		System.out.println(totalScore);
		
		double angScore = totalScore / 2.0;	//평균
		System.out.println(angScore);
		System.out.println("==================================================================================");
		
		/*
		 * 	증가, 감소 연산자
		 * 
		 * 	++	항의 값에 1을 더함	val = ++num;	먼저 num 값이 1 증가 후 val 변수에 대입
		 * 						val = num++;	val 변수에 기존 num 값을 먼저 대입 후 num 값 1증가
		 * 	
		 * 	--	항의 값에서 1을 뺌	val = --num;	먼저 num 값이 1 감소 후 val 변수에 대입
		 * 						val = num--;	val 변수에 기존 num 값을 먼저 대입 후 num 값 1감소
		 * 
		 */
		
		int gameScore = 150;				//게임 점수 150
	
		int lastScore2 = --gameScore;		//gameScore에 1만큼 뺀 값을 lasrScore2에 대입
		System.out.println(lastScore2);

		
		int lastScore1 = ++gameScore;		//gameScore에 1만큼 더한 값을 lasrScore1에 대입
		System.out.println(lastScore1);		//값이 150인 이유 = lastScore2에서 gameScore가 1 감소 된 후 변수 저장됨. 그후 ++강가 연산자를 사용했으므로 149+1=150

		int value = 10;
		int numEx = ++value; // 11 증가 후 변수 대입
		int numEx1 = value++; // 10 변수 대입 후 증가
		System.out.println("==================================================================================");
		
		/*
		 * 		관계 연산자
		 * 
		 * 	>	왼쪽 항이 크면 참,아니면 거짓을 반환
		 * <	왼쪽 항이 작으면 참, 아니면 거짃을 반환
		 * >=	왼쪽 항이 크거나 같으면 참, 아니면 거짓을 반환
		 * <=	왼쪽 항이 작거나 같으면 참, 아니면 거짓을 반환
		 * ==	두 항의 값이 같으면 참, 아니면 거짓을 반환
		 * !=	두 항이 다르면 참, 아니면 거짓을 반환
		 */
		int myAge = 27;					//	나이는 27
		boolean value1 = (myAge > 25);	//	myAge값이 25보다 크면 true
		System.out.println(value1);		//	myAge값이 25보다 큰 27이기에 true 반환
		
		/*
		 * 		논리 연산자
		 * 
		 * 	&&(논리 곱)	두 항이 모두 참인 경우에만 결과값이 참, 아닌 경우 거짓(두가지 모두 참이여야함)			boolean val = (5 > 3) && (5 > 2);
		 * 	||(논리 합)	두 항 중 하나의 항이 참이면 결과값이 참, 모두 것이이면 거짓(둘 중 하나만 참이여도 참)	boolean val = (5 > 3) || (5 < 2);
		 * 	!(부정)		단항 연산자, 참인 경우 거짓으로 바꾸고, 거짓인 경우 참으로 바꿈					boolean val = !(5 > 3);
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);					// flag값은 참
		
		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag); 					// num1값이 0보다 크므로 flag값은 거짓
		
		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag); 					// num1과 num2 두개의 비교 값중 하나가 참이므로 flag값은 참
		
		System.out.println("==================================================================================");
		
		int num3 = 10;
		int i = 2;
		
		boolean value2 = ((num3 = num3 + 10) < 10) && ((i = i + 2) < 10);	//	논리 곱에서 앞의 항이 거짓으므로 뒷에 항은 실행되지 않음
		System.out.println(value2);
		System.out.println(num3);
		System.out.println(i);
		
		value2 = ((num3 = num3 + 10) > 10) || ((i = i + 2)< 10);			//	논리 합에서 앞의 항이 참으므로 뒤 항은 실행 되지 않음
		System.out.println(value2);
		System.out.println(num3);
		System.out.println(i);
		System.out.println("==================================================================================");
		/*
		 * 		복합 대입 연산자
		 * 
		 * 	+=		두 항의 값을 더해서 왼쪽항에 대입											num1 += 2; 
		 * 																				num1 = num1 + 2; 와 같음
		 * 	-=		왼쪽 항에서 오른쪽항을 뺸 후 값을 왼쪽 항에 대입								num1 -= 2;
		 * 																				num1 = num1 - 2; 와 같음
		 *	*=		두항의 값을 곱해서 왼쪽항에 대입											num1 *= 2;
		 *																				num1= num1 * 2; 와 같음
		 *	/=		왼쪽 항을 오른쪽 항으로 나누어 그 몫을 왼쪽 항에 대입							num1 /= 2;
		 *																				num1 = num1 / 2; 와 같음
		 *	%=		왼쪽 항을 오른쪾 항으로 나누어 그 나머지 값을 왼쪽 항에 대입						num1 %= 2;
		 *																				num1 = num1 % 2; 와 같음
		 *	<<=		비트를 왼쪽으로 이동하고 그 값을 왼쪽 항에 대입									num1 <<= 2;
		 *																				num1 = num1 << 2; 와 같음
		 *	>>=		비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입								num1 >>= 2;
		 *																				num1 = num1 >> 2; 와 같음
		 *	>>>=	비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입(왼쪽에 채워 지는 비트 값은 0)		num1 >>>= 2;
		 *																				num1 = num1 >>> 2; 와 같음
		 *	&=		두 항의 & 비트 연산 후 그 값을 왼쪽 항에 대입									num1 &= 2;
		 *																				num1 = num1 & 2; 와 같음
		 *	|=		두 항의 | 비트 연산 후 그 값을 왼쪽 항에 대입									num1 |= 2;
		 *																				num1 = num1 | 2; 와 같음
		 *	^=		두 항의 ^ 비트 연산 후 그 값을 왼쪽 항에 대입									num1 ^= 2;
		 *																				num1 = num1 ^ 2; 와 같음
		 */
		
	}

}
