package inner;

public class Main {

	public static void main(String[] args) {
		// TODO Outer 클래스의 객체(인스턴스)를 생성
		Outer outer = new Outer();
		outer.outerMethod();
		
		//Inner 클래스의 객체를 직접 생성할 수 없음.
		//Inner inner = new Inner();
		
		//내부 클래스의 객체를 외부에서 생성하고자 하면 외부클래스를 통해서 접근. 
		//Inner는 아우터 안에 만들어서 아우터를 통해서만 갈수 있음.. 안되는건 아니지만 굳이 이렇게 쓰진 않음..
		//Outer.Inner i = new Outer().new Inner();
		//i.innerMethod();
		
		//상속받은 클래스의 인스턴스를 생성하고 메소드를 호출
		Thread th = new ThreadEx();
		th.start();
		//익명 객체를 이용해서 구현
		Thread th1 = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<10; i=i+1) {
					System.out.printf("익명 객체\n");
				}
			}
		};
		th1.start();
	}
	{
		//java.lang.math 클래스의 random 메소드는 
		//0.0에서 1.0 사이의 랜덤한 실수를 생성해주는 메소드.
		//static 메소드 : 인스턴스 생성할 필요 없음.
		//매개변수 없음.
		//return type이 double
		double d = Math.random();
		System.out.printf("%f\n", d);

		//String 클래스의 toUpperCase 메소드는 
		//영문을 모두 대문자로 변경해주는 메소드.
		//touppercase 는 스태틱 메소드 아님 : 인스턴스가 있어야 함. 
		//매개변수 없음.
		//String으로 return
		String str = "Hello World";
		String result = str.toUpperCase();
		System.out.printf("%s\n", result);
	
	
	}
}
