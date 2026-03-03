package static2.ex;

public class Car {
    //TODO 코드 작성
    private String carName;
    private static int count;

    public Car(String carName){
        this.carName = carName;
        count++;
        System.out.println("차량 구입, 이름: " + this.carName);
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " + count);
    }
}
