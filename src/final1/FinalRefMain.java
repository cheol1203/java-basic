package final1;

public class FinalRefMain {
    /*
    참조형 변수에 final이 붙으면 더는 참조값을 변경할 수 없다.
    하지만, 참조 대상의 객체 값은 변경할 수 있다.
     */
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); //final 변경 불가 컴파일 오류

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
