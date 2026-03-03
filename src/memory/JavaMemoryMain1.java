package memory;

public class JavaMemoryMain1 {
    /*
    스택 영역 : 지역 변수, 메서드 호출 정보, 중간 연산 결과 저장
    LIFO 구조
    **쓰레드당 하나의 실행 스택 생성
    **메서드당 하나의 스택 프레임
     */
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end");
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
