package interfacesample;

public class Main {

	public static void main(String[] args) {
		// ServiceImpl 객체를 생성.
		//ServiceImpl service = new ServiceImpl();     <- 이렇게 많이 하지만. 밑에 처럼도 함.
	
		//인터페이스를 implements 한 클래스의 객체를 만들 때는
		//변수를 만들 때 인터페이스 이름을 사용하기도 함. 
		Service service = new ServiceImpl();
		service.insert();
		service.read();
		service.update();
		service.remove();
		
	}

}
