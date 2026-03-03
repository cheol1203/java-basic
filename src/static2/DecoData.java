package static2;

public class DecoData {
    /*
    1. static 메서드 안에선 정적 메서드나 정적 변수만 사용가능하다.
        -인스턴스 메서드나 인스턴스 변수는 사용불가-
    2. 반대로 모든 곳에서 static 호출 가능
     */
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
