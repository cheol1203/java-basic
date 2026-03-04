package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    /*
    protected : 자식과 부모는 다른 패키지이지만, 상속관계이므로 접근할 수 있다.
     */
    public void call() {
        publicValue = 1;
        protectedValue = 1; //상속 관계 or 같은 패키지
        //defaultValue = 1; //다른 패키지 접근 불가, 컴파일 오류
        //privateValue = 1; //접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod(); //상속 관계 or 같은 패키지
        //defaultMethod(); //다른 패키지 접근 불가, 컴파일 오류
        //privateMethod(); //접근 불가, 컴파일 오류

        printParent();
    }
}
