package poly.basic;

public class CastingMain5 {
    /*
    instanceof : 인스턴스의 타입을 확인하고 싶을 때 사용
     */
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        //오른쪽에 있는 타입에 왼쪽에 있는 인스턴스의 타이이 들어갈 수 있는지 대입, 가능하면 true, 아니면 false
        if(parent instanceof Child){
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
