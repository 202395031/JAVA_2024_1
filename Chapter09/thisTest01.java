/*
 * 작성일 : 2024년 05월 10일
 * 작성자 : 컴퓨터공학부 202395031 천승용
 * 설명 : 생성자 활용
*/
class Box1 {
	int width, height, depth;	// 멤버변수
	
	// 생성자
	// 매개변수로 지정된 w, h, d 는 의미를 알기 어렵다.
	public Box1(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}
public class thisTest01 {

	public static void main(String[] args) {
		Box1 myBox = new Box1(1,2,3);
		System.out.println(myBox.width);
	}

}
