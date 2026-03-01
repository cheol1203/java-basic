package access.ex;

public class ShoppingCartMain {
    /*
    ShoppingCartMain 코드가 작동하도록 Item, ShoppingCart 클래스를 완성해라.

    요구사항
        1. 접근 제어자를 사용해서 데이터를 캡슐화 하세요.
        2. 해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
        3. 장바구니에는 상품의 종류를 최대 10가지만 담을 수 있다.
            상품의 종류 10개 초과 등록시: "장바구니가 가득 찼습니다." 출력
     */
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}
