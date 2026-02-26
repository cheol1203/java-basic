package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    /*
    this()는 생성자 내부에서 자신의 생성자를 호출한다.
    생성자 코드의 첫줄에만 사용 가능하다.
     */
    MemberConstruct(String name, int age){
        this(name,age,40);
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
