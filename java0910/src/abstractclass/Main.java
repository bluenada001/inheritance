package abstractclass;

public class Main {

	public static void main(String[] args) {
		//현재는 Star 클래스가 abstract 클래스가 아님.
		//abstract class 가 아니어서 현재는 객체 생성이 가능. (new Star)
		//Star 클래스의 class 앞에 abstract를 추가하면 에러가 남. (인스턴스화 할수없다)
		//Star star = new Star();
		
		
		/*
		//Protoss 클래스의 인스턴스 생성
		Protoss p = new Protoss();
		p.attack();
		
		//Zerg 클래스의 인스턴스 생성
		Zerg z = new Zerg();
		z.attack();
		
		//Terran 클래스의 인스턴스 생성
		Terran t = new Terran();
		t.attack();
		*/
		
		//상위 클래스 만든 이후 위에서 아래처럼 메인 코드가 변경가능 함. 
		
		//Protoss 클래스의 인스턴스 생성
		Star s = new Protoss();
		s.attack();
		
		//Zerg 클래스의 인스턴스 생성
		s = new Zerg();
		s.attack();
		
		//Terran 클래스의 인스턴스 생성
		s = new Terran();
		s.attack();
	}
}

