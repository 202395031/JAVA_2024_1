/*
 * 작성일 : 2024년 03월 19일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 다중 if문 실습.
 * 		 하나의 정수를 입력 받아 
 * 		 음수인지 양수인지 0인지 확인하는 프로그램.
 * 
 * 문제분석 : 음수는 0보다 작은 수이다.
 * 			정수를 입력 받아 0보다 작은지 비교, 판단.
 * 			양수는 0보다 큰 수이다.
 * 			입력받은 정수가 0보다 큰지 판단.	
 * 			0은 0이다.
 * 알고리즘 : 1. 정수를 입력받는다.
 * 			2. 만약에 입력받은 정수가 0보다 작은가?
 * 				2-1 "{}은 음수이다." 를 출력한다.
 *			3. 아니고 만약에 입력받은 정수가 0보다 큰가?
 *				3-1 "{}은 양수이다." 를 출력한다.
 *			4. 아니면(나머지)
 *				4-1 0입니다.
 *			
 */

import java.util.Scanner;

public class MultiIfTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 정수를 입력받는다.
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		
		// 2. 음수인지
		if(num < 0) {
			System.out.println(num + "은(는) 음수입니다.");
		}
		// 3. 아니면 양수인지
		else if(num > 0) {
			System.out.println(num + "은(는) 양수입니다.");
		}
		// 4. 아니면(0이다. num == 0)
		else {
			System.out.println("0입니다.");
		}
		// 조건과 상관없이 무조건 출력 되는 문장.
		System.out.println("프로그램 종료");
	}

}
