package extends1.super2;

public class ClassB extends ClassA{
    /*
    상속 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다.(규칙)
    생성자의 첫줄에 부모 클래스의 생성자를 호출해야함
    this()를 사용하기도 하지만, super는 자식의 생성자 안에서 언젠가는 반드시 호출해야 함
    부모에서 자식 순서로 초기화가 진행된다.
     */

    public ClassB(int a) {
        this(a, 0);
        System.out.println("ClassB 생성자 a="+a);
    }

    public ClassB(int a, int b) {
        super(); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a + " b=" + b);
    }
}
