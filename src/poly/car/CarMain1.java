package poly.car;

public class CarMain1 {
    /*
    OCP(Open-Closed Principle)원칙 : 기존 클라이언트 코드 수정 없이 새로운 기능을 추가할 수 있다.
    ==전략 패턴
     */
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경(k3 -> model3)
        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
    }
}
