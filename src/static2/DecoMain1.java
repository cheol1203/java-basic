package static2;

public class DecoMain1 {
    /*
    static 메서드를 사용하지 않을 때
    필드 변수를 사용하지 않는 간단한 메서드를 사용할 때도 객체를 생성해야하는 번거로움이 있다.
     */
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
