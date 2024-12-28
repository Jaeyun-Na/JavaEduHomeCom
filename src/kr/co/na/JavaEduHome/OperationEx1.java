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
		System.out.println("==================================================================================");
		/*
		 * 		조건 연산자
		 * 
		 * 	조건식 ? 결과1 : 결과2		조건식이 참이면 결과1, 조건식이 거짓이면 결과2가 선택됨			int num = (5 > 3) ? 10 : 20
		
		 */
		
		int fatherAge = 45;
		int motherAge = 43;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
		//문제
		int num =10;
		boolean isEven;
		isEven = (num % 2 == 0) ? true : false;
		
		System.out.println(isEven);
		
		System.out.println("==================================================================================");
		
		/*
		 * 		비트 연산자
		 * 비트 단위로 &,|,^,~ 연산이 이루어짐
		 * 
		 * 		$(and)연산자
		 * 두개의 비트값이 모두 1인 경우에만 연산 결과 값이 1이됨
		 * 
		 * 	int num1 = 5;							num1 	: 00000101
		 * 	int num2 = 10;						  & num2 	: 00001010
		 *	int result = num1 & num2;				result	: 00000000	->	10진수 = 0
		 * 
		 * 
		 * 		|(or) 연산자
		 * 비트 값이 하나라도 1이면 연산 결과 값이 1이 됨
		 * 	
		 * 	int num1 = 5;							num1 	: 00000101
		 * 	int num2 = 10;						  | num2 	: 00001010
		 *	int result = num1 | num2;				result	: 00001111	->	10진수 = 15
		 * 
		 * 
		 * 		^(X or)연산자
		 * 	비트 값이 같은 값이면 0, 다른 값이면 1이됨
		 * 
		 * 	int num1 = 5;							num1 	: 00000101
		 * 	int num2 = 10;						  ^ num2 	: 00001010
		 *	int result = num1 ^ num2;				result	: 00001111	->	10진수 = 15 
		 *
		 *		~(반전)연산자
		 *	비트 값을 0은 1로, 1은 0으로 바꾸는 연산자
		 *
		 *	int num = 10;							num		: 00001010
		 *	int result = ~num;					  ~ num		: 11110101	->	10진수 = -11
		 *
		 *
		 *
		 *		비트 이동 연산자
		 *	<<,>>,>>> 이렇게 3가지로 되어있음. 시프트(shift)연산자라고도 함
		 *
		 *
		 *		<<연산자
		 *	<<연산자는 비트를 왼쪽으로 이동시킴
		 *
		 *	int num = 5;							num		: 00000101
		 *	num << 2;								num << 2: 00010100
		 *
		 *
		 *		>>연산자
		 *	>>연산자는 비트를 오른쪽으로 이동시킴
		 *
		 *	int num = 10;							num		: 00001010
		 *	num >> 2;								num	>> 2: 00000010
		 *
		 *
		 *		>>>연산자
		 *	>>>연산자는 >>연산과 동일하게 비트를 오른쪽으로 이동함.
		 *	차이가 있다면 >>>연산자는 왼쪽에 채워지는 비트 값이 부호 비트와 상관 없이 무조건 0이 됨
		 *	-예제-
		 */
		int num4 = 0B00000101;
		
		System.out.println(num << 2);		//왼쪽으로 2비트 이동	00010100
		System.out.println(num >> 2);		//오른쪽으로 2비트 이동	00000001
		System.out.println(num >>> 2);		//오른쪽으로 2비트 이동	00000001
		
		System.out.println(num4);
		
		num4 = num4 << 2;
		System.out.println(num4);
		
		/*
		 * 		연산자 우선 순위
		 * 	* 단항 연산자가 가장 높고 이항, 삼항 연산자 순서
		 *  * 대입 연산자의 우선순위가 가장 낮음.
		 *  * 산술, 관계, 논리, 대입 연산자 순서로 우선 순위를 가지며 ()의 우선 순의가 가장 높다.
		 *  
		 *  
		 *  
		 *  	우선순위		형		연산자				연산방향
		 *  	  1		  일자식		()[].		  		-->
		 *    	  2		  단항		! ++ -- + -	  		<--
		 *    	  3		  산술		% /			  		-->
		 *    	  4		  산술		+ -			  		-->
		 *    	  5		  비트 이동	<< >>		  		-->
		 *    	  6		  관계		< > <= >=	  		-->
		 *    	  7		  관계		== !=		  		-->
		 *    	  8		  비트 곱		&			  		-->
		 *    	  9		  비트 차		^			  		-->
		 *    	  10	  비트 합		|			  		-->
		 *    	  11	  논리 곱		&&			  		-->
		 *    	  12	  논리 합		||			  		-->
		 *   	  13	  조건		? :		  			-->
		 *     	  14	  대입		= += -= *= %= /=	<--
		 *     
		 *        
		 *		연산자 우선순위가 높은 순으로 배치
		 *		&&, ++, +=, ==   -->   ++ == && +=
		 *
		 */
		System.out.println("==================================================================================");
		int myAge1 = 23;
		int teacherAge = 38;
		
		boolean value3 = (myAge1 > 25);
		System.out.println(value3);
		
		System.out.println(myAge1 <= 25);
		System.out.println(myAge1 == teacherAge);
		
		char ch1;
		ch1 = (myAge1 > teacherAge) ? 'T' : 'F';
		
		System.out.println(ch1);
		
		System.out.println("==================================================================================");
		
		int num5;
		num5 = -5 + 3 * 10 / 2;
		System.out.println(num5);	//10
		
		System.out.println("==================================================================================");
		
		int num6 = 10;
		
		System.out.println(num6);	//10
		System.out.println(num6++);	//11	--> 10 값을 반환 후 증강
		System.out.println(num6);	//10	--> 11 위에서 증강된 값이 대입 되었으니 11
		System.out.println(--num6);	//9		--> 10 11에서 먼저 차감 후 대입
		
		System.out.println("==================================================================================");
		
		int num7 = 10;
		int num8 = 20;
		boolean result;
		
		result = ((num7 >10) && (num8 > 10));
		System.out.println(result);				//false
		result = ((num7 > 10) || (num8 > 10));
		System.out.println(result);				//true
		System.out.println(!result);			//false
		
		System.out.println("==================================================================================");
		
		int num9 = 2;			//0000 0010
		int num10 = 10;			//0000 1010
		
		System.out.println(num9 & num10);		//0000 0010
		System.out.println(num9 | num10);		//0000 1010
		System.out.println(num9 ^ num10);		//0000 1000
		System.out.println(~num9);				//1111 1101
		
		System.out.println("==================================================================================");
		
		int num11 = 8;		//0000 1000
		
		System.out.println(num11 += 10);	//18
		System.out.println(num11 -= 10);	//-1
		System.out.println(num11 >>= 2);	//0000 0010
		
		System.out.println("==================================================================================");
		
		
		int num12 = 10;
		int num13 = 20;
		
		int result2 = (num12 >= 10) ? num13+10 : num13-10;
		System.out.println(result2);		//30
}

}
