package construct;

public class ConstructMain1 {
    /*
    1.생성자를 통해 객체를 생성한 이후 바로 초기값을 할당할 수 있다.
    2.생성자를 사용하면 필수값 입력을 보장할 수 있다.
    3.생성자는 반드시 호출되어야 한다.
    4.생성자가 없으면 기본 생성자가 제공된다.
    5.생성자가 하나라도 있으면 기본 생성자가 제공되지 않는다. 이 경우 개발자가 정의한 생성자를 직접 호출해야 한다.
     */
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1,member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
