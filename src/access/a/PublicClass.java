package access.a;

public class PublicClass {
    /*
    클래스레벨에서는 public, default만 사용가능
    public 클래스는 파일명과 이름이 같아야한다.
    하나의 자바파일에 public 클래스는 하나만 존재할 수 있다.
    default 클래스는 무한정 생산 가능하다.
     */
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1 {
}

class DefaultClass2 {
}