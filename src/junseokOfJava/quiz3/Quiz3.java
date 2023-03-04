package junseokOfJava.quiz3;

import java.util.Scanner;

// 3장. 변수 퀴즈 문제들 
public class Quiz3 {
	
	/***********************************************************
	 * @quiz 3-3
	 * 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 
	 * 만일 변수 num의 값이 456이라면 400이 되고, 111이라면 100이 된다.
	 ***********************************************************/
	int intFloor(int sc1){
		int num = Math.round(sc1/100)*100;
		System.out.println(num);
		return num;
	}
	
	/***********************************************************
	 * @quiz 3-5
	 * 변수 num의 값에 따라 양수 음수 0 출력코드이다. 삼항 연산자를 이용
	 **********************************************************/
	void numSign(double sc2) {
		double num = sc2;
		System.out.println(num>0?"양수":(num==0?"0":"음수"));
	}
	
	public static void main(String[] args) {
		// 스캐너 
		Scanner sc = new Scanner(System.in);
		
		// 첫번째 입력
		Quiz3 q = new Quiz3();
		double sc1 = sc.nextDouble();
//		int sc1 = sc.nextInt();
		
		q.intFloor((int) sc1);
		q.numSign(sc1); 
		
	}

}
