package extends1.overriding;

public class ElectricCar extends Car {
    /*
    부모에게서 상속 받은 기능을 자식이 재정의 하는 것을 메서드 오버라이딩이라 한다.
    @Override 추가하기 : 오버라이딩 조건을 만족시키지 않으면 컴파일 에러를 발생시킨다.
    @ = 에노테이션

    오버라이딩 조건
        1. 메서드 이름이 같아야한다.
        2. 매개변수 타입,순서,개수가 같아야함
        3. 반환 타입이 같아야 함
        4. 접근 제어자는 상위 클래스의 메서드보다 더 제한적이어서는 안된다.
        5. 생성자는 오버라이딩 할 수 없다.
        6. static, final, private 키워드가 붙은 메서드는 오버라이딩 될 수 없다.
        7. 상위 클래스의 메서드보다 더 많은 체크 예외를 throws로 선언할 수 없다.
     */
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
