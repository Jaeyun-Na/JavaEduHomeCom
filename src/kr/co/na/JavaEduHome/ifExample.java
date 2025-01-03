package kr.co.na.JavaEduHome;

public class ifExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 		조건문
		 * 
		 * 		if문과 if - else문
		 * 		if(조건식){
		 * 			수행문1		//조건식이 참일 경우 실행
		 * 		} else {
		 * 			수행문2		//조건문이 거짓일 경우 실행
		 * 		}
		 * 
		 * 
		 */
		
		int age = 61;
		if(age >= 8) {
			System.out.println("go to school");
		} else {
			System.out.println("not go to school");
		}
		
		char gender = 'F';
		if(gender == 'F') {
			System.out.println("I'm woman");
		} else {
			System.out.println("I'm man");
		}
		
		/*
		 * 		if - else if - else 문
		 * 		if(조건식1){
		 * 			수행문1;		//조건식1이 참일 경우 수행
		 * 		} else if(조건식2){
		 * 			수행문2;		//조건식2가 참일 경우 수행
		 * 		} else if(조건식3){
		 * 			수행문3;		//조건식3이 참일 경우 수행
		 * 		} else {
		 * 			수행문4;		//위 조건이 모두 해당하기 않는 경우 수행함
		 * 		}
		 * 		수행문5;			//if - else if - else문이 띁난 후 수행함
		 * 		}
		 */
		// age는 21줄 참고
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("미취학 아동");
		} else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생");
		} else if(age < 20) {
			charge = 2500;
			System.out.println("중,고등학생");
		} else if(age >= 60) {
			charge = 0;
			System.out.println("경로우대 입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인");
		}
		System.out.println("입장료는 "+ charge +"원 입니다.");
		
		
		/*
		 *  55번 줄 [age >= 8 && age < 14] 라고 쓰지 않는 이유
		 *  if - else if - else문에서는 하나의 조건을 만족하면 다른 조건은 더 이상 비교하지 않음
		 */
		
		/*
		 * 	if - else if문과 if - if문의 차이
		 * 
		 * 	if - else if문은 하나의 조건을 만족하면 나머지 조건을 비교하지 않고 다음 수행문으로 넘어감.
		 * 	하지만 if문으로만 이루어진 코드는 조건마다 마다 비교함.
		 */
		
		System.out.println("==============================================================================================================");
		System.out.println("");
		int age1 = 9;
		
		if(age1 < 8) {
			charge = 1000;
			System.out.println("미취학아동");
		} if(age1 < 14) {
			charge = 2000;
			System.out.println("초등학생");
		} if(age1 < 20) {
			charge = 2500;
			System.out.println("중,고등학생");
		} else {
			charge = 3000;
			System.out.println("일반인");
		}
		System.out.println("입장료는 "+ charge +"원 입니다.");
		
		/*
		 * 90번, 93번 모두 해당이 되므로 콘솔에 결과값이 나옴.
		 */

		System.out.println("==============================================================================================================");
		System.out.println("");
		
		//성적따라 학점 부여
		//A=100~90, B=89~80, C=79~70, D=69~60, 나머지 F
		//int 변수 = score, char 변수 = grade
		
		
		int score = 101;
		char grade = 'F';
		
		if(score > 100) {
			System.out.println("잘못된 점수입니다.");
		} else if(score == 100) {
			grade = 'A';
			System.out.println(grade+"학점 입니다");
		} else if(score >= 90) {
			grade = 'A';
			System.out.println(grade+"학점 입니다");
		} else if(score >= 80) {
			grade = 'B';
			System.out.println(grade+"학점 입니다");
		} else if(score >= 70) {
			grade = 'C';
			System.out.println(grade+"학점 입니다");
		} else if(score >= 60) {
			grade = 'D';
			System.out.println(grade+"학점 입니다");
		} else {
			System.out.println(grade+"학점 입니다.");
		}
		
		System.out.println("==============================================================================================================");
		System.out.println("");
		
		
		/*
		 * 조건문과 조건 연산자
		 * ===========================
		 * if(a > b)
		 * 	max = a;
		 * else
		 * 	max = b;
		 * ===========================
		 * max = (a > b) ? a : b;
		 * ===========================
		 * 변수 = (조건문) ? 맞을때 값 : 틀릴때 값;
		 * 
		 * 
		 * 예시
		 * ===========================
		 * if(score >= 90){
		 * 	grade = 'A';
		 * }else{
		 * 	grade = 'B';
		 * }
		 * ==================================
		 * grade = (score >= 90) ? 'A' : 'B'; 
		 * ===================================
		 * 
		 */
		
		/*
		 *  switch - case문
		 *  조건이 많아질떄 if-else if문을 사용할 경우 가독성이 떨어지게됨.
		 *  조건이 많을때는 switch-case문을 사용할 경우 {}를 여러번 사용하지 않아 가독성도 올라감 
		 */
		System.out.println("==============================================================================================================");
		System.out.println(" if - else if문 ");
		int rank = 1;
		char medalColor;
		
		if(rank == 1) {
			medalColor = 'G';
			System.out.println(rank+"등의 메달은"+medalColor+"입니다.");
		} else if(rank == 2) {
			medalColor = 'S';
			System.out.println(rank+"등의 메달은"+medalColor+"입니다.");
		} else if(rank == 3) {
			medalColor = 'B';
			System.out.println(rank+"등의 메달은"+medalColor+"입니다.");
		} else {
			medalColor = 'A';
			System.out.println(rank+"등의 메달은"+medalColor+"입니다.");
		}
		
		System.out.println("==============================================================================================================");
		System.out.println(" switch - case문 ");
		
		
		switch(rank) {
			case 1: medalColor = 'G';
				break;
			case 2: medalColor = 'S';
			break;
			case 3: medalColor = 'B';
			break;
			default : medalColor = 'A';
		}
			System.out.println(rank+"등의 메달은"+medalColor+"입니다.");
			
			System.out.println("==============================================================================================================");
			System.out.println("");
		
		/*
		 * case: ~ break; 까지가 조건에 해당하는 문장. rank 값이 1이면 case 1의 코드가 수행, rank 값이 2이면 case 2의 코드가 수행
		 * rank값과 일치하는 case가 없다면 default 코드가 수행됨
		 * 
		 * break를 하지 않을경우 조건이 맞는 부분에서 멈추지 않고 끝까지 실행 후 default값을 실행하게됨
		 * 
		 * 
		 * switch - case문은 동시에도 사용이 가능함
		 * ex) 아래는 월의 잀수를 나타내는 내용.
		 * 
		 * case 1: case 3: case 5: case 7: case 8: case 10: case 12: day = 31;
		 * 	break;
		 * case 4: case 6: case 9: case 11: day = 30;
		 *  break;
		 * case 2: day = 28;
		 * 	break; 
		 * 
		 */
		/*
		 * 		case문에 문자열 사용
		 * 	JAVA7 이상 부터는 문자열 사용이 가능해짐 equals() 매서드를 사용하지 않아도 됨
		 */
			
		String medal = "Gold";
		
		switch(medal) {
			case "Gold":
				System.out.println("금메달입니다.");
				break;
			case "Silver":
				System.out.println("은메달입니다.");
				break;
			case "Bronze":
				System.out.println("동메달입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				break;
		}
		
		System.out.println("==============================================================================================================");
		System.out.println("");
		
		//연습 문제
		//5층짜리 건문. 1층 약국, 2층 정혛외과, 3층 피부과, 4층 치과, 5층 헬스클럽
			
		int floor = 1;
		
		switch(floor) {
			case 1:
				System.out.println(floor+"층은 약국입니다.");
				break;
			case 2:
				System.out.println(floor+"층은 정형외과입니다.");
				break;
			case 3:
				System.out.println(floor+"층은 피부과입니다.");
				break;
			case 4:
				System.out.println(floor+"층은 치과입니다.");
				break;
			case 5:
				System.out.println(floor+"층은 헬스클럽입니다.");
				break;
			default:
				System.out.println("층수를 입력해 주세요.");
				break;
		}
		
		System.out.println("==============================================================================================================");
		System.out.println("");
		
		//	반복문
		
		int loopNum = 1;
		loopNum += 2;
		loopNum += 3;
		loopNum += 4;
		loopNum += 5;
		loopNum += 6;
		loopNum += 7;
		loopNum += 8;
		loopNum += 9;
		loopNum += 10;
		
		System.out.println("반복문 예시1: 1 부터 10까지의 합은 "+loopNum+"입니다.");

		/*
		 * 위는 효육적이지 않은 코드임.
		 * 반복되는 일을 처리하는것이 반복문임
		 */
		
		//		while문
		
		/*
		 * 	while(조건식1){		<--
		 * 	수행문1					조건식1이 참일 경우 수행문1 계속 실행
		 * 	}					<--
		 * 	수행문2				<-- 조건식1이 거짓일 경우 수행문2 실행
		 */
		  	int exNum = 1;
		  	int exSum = 0;
		  
		  	while(exNum <= 10){
		  	exSum = exSum + exNum;
		 // exSum += exNum;
		  	exNum ++;
		  	}
		  
			System.out.println("반복문 예시2: 1 부터 10까지의 합은 "+exSum+"입니다.");

		//		do-while문
			
		/*	while문은 조건을 먼저 검사하므로 조건이 맞지 않으면, 반복 수행이 일어나지 않음.
		 * 	do-while문의 경우 {}안의 문장을 무.조.건 한번 수행 후, 조건식 검사가 이루어짐
		 * 	
		 * 	do{
		 * 		수행문1;
		 * 	}
		 * 	while(조건식1);
		 * 	수행문2;
		 */
			int exNum1 = 1;
			int exSum1 = 0;
			
			do {
				exSum1 += exNum1;
				exNum1++;
			}
			while(exNum1 <= 10);
		
			System.out.println("반복문 예시3: 1 부터 10까지의 합은 "+exSum1+"입니다.");
		
			
		//		for문
		
		/*	반복문 중 가장많이 사용하는 반복문.
		 * 	while문, do-while문보다 구조가 조금 더 복잡함.(변수의 초기화식, 조건식,증감식)
		 * 
		 * 	[기본 구조]
		 * 
		 * 	for(초기화식; 조건식; 증감식){
		 * 		수행문;
		 * 	}
		 */
			int exNum2;
			for(exNum2 = 1; exNum2 <= 5; exNum2++) {
				System.out.println("for문입니다. :"+exNum2);
			}
		//	for문 예시
			
			int i;
			int sum;
			
			for(i = 1, sum = 0; i <= 10; i++) {
				sum += i;
			}
			System.out.println("for문 : 1부터 10까지의 합은 "+sum+"입니다.");
			
			
		//예제: for문과 변수를 사용여, 안녕하세요1,안녕하세요2....안녕하세요10까지 차례로 출력 되도록 작성해보자
			
			int ex;
			for(ex = 1; ex <= 10; ex++) {
				System.out.println("for문 예제 : 안녕하세요"+ex);
			}
			
			System.out.println("==============================================================================================================");
			System.out.println("");
			
			
			
			
	}

}
