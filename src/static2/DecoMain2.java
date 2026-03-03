package static2;

public class DecoMain2 {
    /*
    static 메서드를 사용하여 객체를 생성하지 않고도 메서드를 사용할 수 있다.
     */
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
