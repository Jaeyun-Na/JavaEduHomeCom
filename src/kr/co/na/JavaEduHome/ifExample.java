package kr.co.na.JavaEduHome;

public class ifExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 		���ǹ�
		 * 
		 * 		if���� if - else��
		 * 		if(���ǽ�){
		 * 			���๮1		//���ǽ��� ���� ��� ����
		 * 		} else {
		 * 			���๮2		//���ǹ��� ������ ��� ����
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
		 * 		if - else if - else ��
		 * 		if(���ǽ�1){
		 * 			���๮1;		//���ǽ�1�� ���� ��� ����
		 * 		} else if(���ǽ�2){
		 * 			���๮2;		//���ǽ�2�� ���� ��� ����
		 * 		} else if(���ǽ�3){
		 * 			���๮3;		//���ǽ�3�� ���� ��� ����
		 * 		} else {
		 * 			���๮4;		//�� ������ ��� �ش��ϱ� �ʴ� ��� ������
		 * 		}
		 * 		���๮5;			//if - else if - else���� ���� �� ������
		 * 		}
		 */
		// age�� 21�� ����
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ�");
		} else if(age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л�");
		} else if(age < 20) {
			charge = 2500;
			System.out.println("��,����л�");
		} else if(age >= 60) {
			charge = 0;
			System.out.println("��ο�� �Դϴ�.");
		} else {
			charge = 3000;
			System.out.println("�Ϲ���");
		}
		System.out.println("������ "+ charge +"�� �Դϴ�.");
		
		
		/*
		 *  55�� �� [age >= 8 && age < 14] ��� ���� �ʴ� ����
		 *  if - else if - else�������� �ϳ��� ������ �����ϸ� �ٸ� ������ �� �̻� ������ ����
		 */
		
		/*
		 * 	if - else if���� if - if���� ����
		 * 
		 * 	if - else if���� �ϳ��� ������ �����ϸ� ������ ������ ������ �ʰ� ���� ���๮���� �Ѿ.
		 * 	������ if�����θ� �̷���� �ڵ�� ���Ǹ��� ���� ����.
		 */
		
		System.out.println("==============================================================================================================");
		System.out.println("");
		int age1 = 9;
		
		if(age1 < 8) {
			charge = 1000;
			System.out.println("�����оƵ�");
		} if(age1 < 14) {
			charge = 2000;
			System.out.println("�ʵ��л�");
		} if(age1 < 20) {
			charge = 2500;
			System.out.println("��,����л�");
		} else {
			charge = 3000;
			System.out.println("�Ϲ���");
		}
		System.out.println("������ "+ charge +"�� �Դϴ�.");
		
		/*
		 * 90��, 93�� ��� �ش��� �ǹǷ� �ֿܼ� ������� ����.
		 */

		System.out.println("==============================================================================================================");
		System.out.println("");
		
		//�������� ���� �ο�
		//A=100~90, B=89~80, C=79~70, D=69~60, ������ F
		//int ���� = score, char ���� = grade
		
		
		int score = 101;
		char grade = 'F';
		
		if(score > 100) {
			System.out.println("�߸��� �����Դϴ�.");
		} else if(score == 100) {
			grade = 'A';
			System.out.println(grade+"���� �Դϴ�");
		} else if(score >= 90) {
			grade = 'A';
			System.out.println(grade+"���� �Դϴ�");
		} else if(score >= 80) {
			grade = 'B';
			System.out.println(grade+"���� �Դϴ�");
		} else if(score >= 70) {
			grade = 'C';
			System.out.println(grade+"���� �Դϴ�");
		} else if(score >= 60) {
			grade = 'D';
			System.out.println(grade+"���� �Դϴ�");
		} else {
			System.out.println(grade+"���� �Դϴ�.");
		}
		
		System.out.println("==============================================================================================================");
		System.out.println("");
		
		
		/*
		 * ���ǹ��� ���� ������
		 * ===========================
		 * if(a > b)
		 * 	max = a;
		 * else
		 * 	max = b;
		 * ===========================
		 * max = (a > b) ? a : b;
		 * ===========================
		 * ���� = (���ǹ�) ? ������ �� : Ʋ���� ��;
		 * 
		 * 
		 * ����
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
		 *  switch - case��
		 *  ������ �������� if-else if���� ����� ��� �������� �������Ե�.
		 *  ������ �������� switch-case���� ����� ��� {}�� ������ ������� �ʾ� �������� �ö� 
		 */
		System.out.println("==============================================================================================================");
		System.out.println(" if - else if�� ");
		int rank = 1;
		char medalColor;
		
		if(rank == 1) {
			medalColor = 'G';
			System.out.println(rank+"���� �޴���"+medalColor+"�Դϴ�.");
		} else if(rank == 2) {
			medalColor = 'S';
			System.out.println(rank+"���� �޴���"+medalColor+"�Դϴ�.");
		} else if(rank == 3) {
			medalColor = 'B';
			System.out.println(rank+"���� �޴���"+medalColor+"�Դϴ�.");
		} else {
			medalColor = 'A';
			System.out.println(rank+"���� �޴���"+medalColor+"�Դϴ�.");
		}
		
		System.out.println("==============================================================================================================");
		System.out.println(" switch - case�� ");
		
		
		switch(rank) {
			case 1: medalColor = 'G';
				break;
			case 2: medalColor = 'S';
			break;
			case 3: medalColor = 'B';
			break;
			default : medalColor = 'A';
		}
			System.out.println(rank+"���� �޴���"+medalColor+"�Դϴ�.");
			
			System.out.println("==============================================================================================================");
			System.out.println("");
		
		/*
		 * case: ~ break; ������ ���ǿ� �ش��ϴ� ����. rank ���� 1�̸� case 1�� �ڵ尡 ����, rank ���� 2�̸� case 2�� �ڵ尡 ����
		 * rank���� ��ġ�ϴ� case�� ���ٸ� default �ڵ尡 �����
		 * 
		 * break�� ���� ������� ������ �´� �κп��� ������ �ʰ� ������ ���� �� default���� �����ϰԵ�
		 * 
		 * 
		 * switch - case���� ���ÿ��� ����� ������
		 * ex) �Ʒ��� ���� ����� ��Ÿ���� ����.
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
		 * 		case���� ���ڿ� ���
		 * 	JAVA7 �̻� ���ʹ� ���ڿ� ����� �������� equals() �ż��带 ������� �ʾƵ� ��
		 */
			
		String medal = "Gold";
		
		switch(medal) {
			case "Gold":
				System.out.println("�ݸ޴��Դϴ�.");
				break;
			case "Silver":
				System.out.println("���޴��Դϴ�.");
				break;
			case "Bronze":
				System.out.println("���޴��Դϴ�.");
				break;
			default:
				System.out.println("�޴��� �����ϴ�.");
				break;
		}
		
		System.out.println("==============================================================================================================");
		System.out.println("");
		
		//���� ����
		//5��¥�� �ǹ�. 1�� �౹, 2�� ���ܰ�, 3�� �Ǻΰ�, 4�� ġ��, 5�� �ｺŬ��
			
		int floor = 1;
		
		switch(floor) {
			case 1:
				System.out.println(floor+"���� �౹�Դϴ�.");
				break;
			case 2:
				System.out.println(floor+"���� �����ܰ��Դϴ�.");
				break;
			case 3:
				System.out.println(floor+"���� �Ǻΰ��Դϴ�.");
				break;
			case 4:
				System.out.println(floor+"���� ġ���Դϴ�.");
				break;
			case 5:
				System.out.println(floor+"���� �ｺŬ���Դϴ�.");
				break;
			default:
				System.out.println("������ �Է��� �ּ���.");
				break;
		}
		
		System.out.println("==============================================================================================================");
		System.out.println("");
		
		//	�ݺ���
		
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
		
		System.out.println("�ݺ��� ����1: 1 ���� 10������ ���� "+loopNum+"�Դϴ�.");

		/*
		 * ���� ȿ�������� ���� �ڵ���.
		 * �ݺ��Ǵ� ���� ó���ϴ°��� �ݺ�����
		 */
		
		//		while��
		
		/*
		 * 	while(���ǽ�1){		<--
		 * 	���๮1					���ǽ�1�� ���� ��� ���๮1 ��� ����
		 * 	}					<--
		 * 	���๮2				<-- ���ǽ�1�� ������ ��� ���๮2 ����
		 */
		  	int exNum = 1;
		  	int exSum = 0;
		  
		  	while(exNum <= 10){
		  	exSum = exSum + exNum;
		 // exSum += exNum;
		  	exNum ++;
		  	}
		  
			System.out.println("�ݺ��� ����2: 1 ���� 10������ ���� "+exSum+"�Դϴ�.");

		//		do-while��
			
		/*	while���� ������ ���� �˻��ϹǷ� ������ ���� ������, �ݺ� ������ �Ͼ�� ����.
		 * 	do-while���� ��� {}���� ������ ��.��.�� �ѹ� ���� ��, ���ǽ� �˻簡 �̷����
		 * 	
		 * 	do{
		 * 		���๮1;
		 * 	}
		 * 	while(���ǽ�1);
		 * 	���๮2;
		 */
			int exNum1 = 1;
			int exSum1 = 0;
			
			do {
				exSum1 += exNum1;
				exNum1++;
			}
			while(exNum1 <= 10);
		
			System.out.println("�ݺ��� ����3: 1 ���� 10������ ���� "+exSum1+"�Դϴ�.");
		
			
		//		for��
		
		/*	�ݺ��� �� ���帹�� ����ϴ� �ݺ���.
		 * 	while��, do-while������ ������ ���� �� ������.(������ �ʱ�ȭ��, ���ǽ�,������)
		 * 
		 * 	[�⺻ ����]
		 * 
		 * 	for(�ʱ�ȭ��; ���ǽ�; ������){
		 * 		���๮;
		 * 	}
		 */
			int exNum2;
			for(exNum2 = 1; exNum2 <= 5; exNum2++) {
				System.out.println("for���Դϴ�. :"+exNum2);
			}
		//	for�� ����
			
			int i;
			int sum;
			
			for(i = 1, sum = 0; i <= 10; i++) {
				sum += i;
			}
			System.out.println("for�� : 1���� 10������ ���� "+sum+"�Դϴ�.");
			
			
		//����: for���� ������ ��뿩, �ȳ��ϼ���1,�ȳ��ϼ���2....�ȳ��ϼ���10���� ���ʷ� ��� �ǵ��� �ۼ��غ���
			
			int ex;
			for(ex = 1; ex <= 10; ex++) {
				System.out.println("for�� ���� : �ȳ��ϼ���"+ex);
			}
			
			System.out.println("==============================================================================================================");
			System.out.println("");
			
			
			
			
	}

}
