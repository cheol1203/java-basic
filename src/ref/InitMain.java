package ref;

public class InitMain {
    /*
    멤버 변수 : 자동 초기화
    지역 변수 : 수동 초기화
     */
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
