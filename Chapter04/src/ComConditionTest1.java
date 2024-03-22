/*
 * 작성일 : 2024년 03월 22일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 조건식 연습.
 * 		 월을 입력받아 해당 계절을 출력하시오.
 * 		 3,4,5월 => 봄
 * 		 6,7,8월 => 여름
 *   	 9,10,11월 => 가을
 *   	 12,1,2월 => 겨울
 *  
 * 문제 분석 : 입력 받아야 할 값은
 * 			 1,2,3,4,5,6,7,8,9,10,11,12이다.
 * 			 0이나 13을 입력하면? => 해당 월은 없습니다.를 출력하자
 * 			
 * 알고리즘 : 1. 정수를 입력받는다.
 * 			2. 입력받은 정수의 범위가 1~12 이면
 * 				2-1 입력받은 정수가 3,4,5이면
 * 					2-1-1 "봄"을 출력
 *				2-2 입력받은 정수가 6,7,8이면
 * 					2-2-1 "여름"을 출력
 * 				2-3 입력받은 정수가 9,10,11이면
 * 					2-3-1 "가을"을 출력
 * 				2-4 입력받은 정수가 12,1,2이면
 * 					2-4-1 "겨울"을 출력
 */

import java.util.Scanner;

public class ComConditionTest1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// 1. 월을 입력받는다.
		System.out.print("월을 입력하시오. : ");
		int num = stdIn.nextInt();
		
		// 2. 입력받은 정수의 범위가 1~12 이면
		if (num > 1 || num < 12) {
			
			// 2-1 입력받은 정수가 3,4,5이면
			if (num == 3 || num == 4 || num == 5) {
				// 2-1-1 "봄"을 출력
				System.out.println(num + "월은 봄입니다.");
			}
			
			// 2-2 입력받은 정수가 6,7,8이면
			else if (num == 6 || num == 7 || num == 8) {
				// 2-2-1 "여름"을 출력
				System.out.println(num + "월은 여름입니다.");
			}
			
			// 2-3 입력받은 정수가 9,10,11이면
			else if (num == 9 || num == 10 || num == 11) {
				// 2-3-1 "가을"을 출력
				System.out.println(num + "월은 가을입니다.");
			}
			
			// 2-4 아니면
			else {
				// 2-4-1 "겨울"을 출력
				System.out.println(num + "월은 겨울입니다.");
			}
		}
		
		// 3. 아니면
		else {
			// 3-1 "해당 월은 없습니다."를 출력
			System.out.println("해당 월은 없습니다.");
		}
	}

}