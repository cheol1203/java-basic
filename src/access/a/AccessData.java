package access.a;

public class AccessData {
    /*
    private : 자기 클래스에서만 호출 허용
    default(package-private) : 같은 패키지에서의 호출 허용
    protected : 같은 패키지에서 허용 + 다른 패키지라도 상속관계면 허용
    public : 모든 외부 호출 허용
     */
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출 "+ publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
