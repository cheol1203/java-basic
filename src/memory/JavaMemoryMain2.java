package memory;

public class JavaMemoryMain2 {
    /*
    힙 영역 : 객체, 배열이 생성 되는 영역, GC가 이루어지는 곳
    GC는 참조가 모두 사라진 인스턴스를 찾아서 메모리에서 제거한다.
     */
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end");
    }
}
