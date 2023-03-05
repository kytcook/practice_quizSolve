package junseokOfJava.quiz3;

import java.util.Scanner;

public class Quiz3_exe {

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


