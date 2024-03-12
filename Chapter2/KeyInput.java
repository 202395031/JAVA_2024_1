/*
 * 작성일 : 2024년 03월 12일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 이름 입력 받아 출력하기.
 */

// 입력을 위한 라이브러리 포함하기 ctrl + shift + o를 하면 자동으로 나옴
import java.util.Scanner;
public class KeyInput {

	public static void main(String[] args) {
		// 키보드로부터 입력받기 위해 Scanner 객체 생성 (new는 객체 생성)
		//stdIn은 객체 변수명, Scanner은 자료형
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		
		// 사용자의 입력을 문자열로 받아 저장한다.
		String name = stdIn.next();
		
		// 출력
		System.out.println("안녕하세요. " + name + "님 반갑습니다.");
	}
}