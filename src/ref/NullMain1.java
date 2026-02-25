package ref;

public class NullMain1 {
    /*
    null을 .을 통해 참조할때 NullPointerException 예외가 발생한다.
     */
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerException 예외 발생
        System.out.println("data = " + data.value);
    }
}
