package static2;

import static static2.DecoData.staticCall;
// import static을 사용하면 클래스명.메서드()에서 클래스명을 생략 가능하다.

public class DecoDataMain {
    /*
    1. static 메서드 안에선 정적 메서드나 정적 변수만 사용가능하다.
        -인스턴스 메서드나 인스턴스 변수는 사용불가-
        단, 참조값을 직접 매개변수로 전달하면 정적 메서드도 인스턴스의 변수나 메서드를 호출 가능
    2. 반대로 모든 곳에서 static 호출 가능
     */
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        staticCall();

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall(); //단, 이방식은 권장하지 않음
        //클래스를 통한 접근
        DecoData.staticCall();
    }
}
