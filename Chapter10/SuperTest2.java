/*
 * 작성일 : 2024년 05월 24일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 예약어 super2
 * super = 상위 클래스의 생성자 호출 : 반드시 첫 번째 라인에 위치해야한다.
 */
class ST2a {
	int x = 1000;
	
	void display() {
		System.out.println("상위 클래스 메소드");
	}
}

class ST2b extends ST2a {
	int x = 2000;
	@Override
	void display() {
		System.out.println("하위 클래스 메소드");
	}
	
	void write() {
		display();			// 같은 클래스 내의 display 메소드 호출
		super.display();	// 상위 클래스의 display 메소드를 호출
		
		System.out.println("b클래스의 x값은 : " + x);
		System.out.println("a클래스의 x값은 : " + super.x);
	}
}
public class SuperTest2 {

	public static void main(String[] args) {
		ST2b stb = new ST2b();
		stb.write();	// 메소드 호출.
	}

}
