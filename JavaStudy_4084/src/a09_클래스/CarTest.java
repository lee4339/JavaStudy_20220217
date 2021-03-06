package a09_클래스;

public class CarTest {
	/*
	 * Car 클래스 정의
	 * 속성(변수)
	 * company
	 * model
	 * oil
	 * 
	 * 메소드
	 * void go()
	 * 기름 - 1;
	 * 기름이 1 감소하였습니다.
	 * 
	 * void oiling()
	 * 기름 + 1;
	 * 기름이 1 증가하였습니다.
	 * 
	 * void showCarInfo()
	 * ooo회사에서 제조한 ooo차량의 정보입니다.
	 * 현재 기름은 oooo리터 입니다. 
	 * 
	 * oil = 5
	 * go()
	 * 
	 * void oilError(){
	 * 기름이 0보다 적으면 기름이 부족하여 차량의 이동이 불가능합니다.
	 * }
	 */

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c3; // 변수 선언(Car 참조 자료형)
		c3 = new Car(); //Car 객체 생성 -> 힙메모리 영역에 Car클래스 사이즈 만큼 메모리를 빌려 할당하는 것
		//10002588
		
		
		c1.company = "KIA";
		c1.model = "K5";
		c1.oil = 5;
		
		c1.showCarInfo();
		c1.go();
		c1.showCarInfo();
		c1.oiling();
		c1.showCarInfo();
		
		System.out.println();
		
		Car c2 = new Car();
		c2.company = "현대";
		c2.model = "아반떼";
		c2.oil = 5;
		
		c2.showCarInfo();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.go();
		c2.showCarInfo();
		c2.oiling();
		c2.showCarInfo();

	}

}
