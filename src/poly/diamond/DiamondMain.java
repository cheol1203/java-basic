package poly.diamond;

public class DiamondMain {
    /*
    인터페이스는 모두 추상 메서드로 이루어져 있기 때문에 다중 구현이 가능하다.
     */
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
