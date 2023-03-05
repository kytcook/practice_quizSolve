package junseokOfJava.quiz3;

// 4장. 반복문
public class Quiz4 {
	/***********************************************************
	 * @quiz 4-2
	 * 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
	 ***********************************************************/
	void quiz2() {
		int hap = 0;
		for (int i = 1; i <= 20; i++) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				hap += i;
//				System.out.println("quiz2 : " + hap);
			}
		}
		System.out.println("quiz2 : " + hap);
	}

	int quiz2_2(int i) {
		int hap = 0;
		while (0 < i && i <= 20) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				hap += i;
//				System.out.println("quiz2_2 : " + hap);
			}
			i++;
		}
		System.out.println("quiz2_2 : " + hap);
		return hap;
	}

	/***********************************************************
	 * @quiz 4-3 
	 * 1+(1+2)+(1+2+3)+...+(1+2+3+...+10)의 결과
	 ***********************************************************/
	void quiz3(int x) {
		int hap = 0;
		for (int i = x; i <= 10; i++) {
			hap += i;
			// System.out.println("quiz3의 합 : " + hap);
		}
		System.out.println("quiz3의 총합 : " + hap);
	}

	/***********************************************************
	 * @quiz 4-4 
	 * 1+(-2)+3+(-4)+...계속 더할 때, 몇까지 더해야 총합 100이상 될까?
	 ***********************************************************/
	void quiz4() {
		int i = 0;
		int s = -1;
		int num = 0;
		int hap = 0;
		while (hap < 100) {
			i++;
			s = -s;
			num = i * s;
//			System.out.println("num : " + num);
			hap += num;
		}
		System.out.printf("num : %d, hap : %d%n", num, hap);
	}
	
	void quiz4_2() {
		int num = 0;
		int hap = 0;
		int s = 1;
		
		for(int i=1; hap < 100; i++, s=-s) {
			num = i * s;
			hap += num;
//			System.out.println("num : " + num);
		}
		System.out.printf("num : %d, hap : %d%n", num, hap);
		
	}
	public static void main(String[] args) {
		Quiz4 q = new Quiz4();
		// 4-2
		q.quiz2();
		q.quiz2_2(1);

		// 4-3
		q.quiz3(1);

		// 4-4
		q.quiz4();
		q.quiz4_2();
	}

}
