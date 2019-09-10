package inner;

public class Outer {
	//클래스 안에 만들어 진 내부 클래스
	//이 클래스는 Outer 안에서만 사용이 가능. 
	//대신에 public 이기 때문에 Outer 객체는 접근이 가능 함. 
	public class Inner{
		public void innerMethod() {
			System.out.printf("내부 클래스의 메소드\n");
		}
	}
	
	public void outerMethod() {
		//inner 클래스의 객체 만들기.
		Inner inner = new Inner();
		inner.innerMethod();
		
	}
}
