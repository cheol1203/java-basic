package class1.ex;

public class ProductOrderMain {
    /*
    요구사항
    1. ProductOrder 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
        상품명(productName)
        가격(price)
        주문 수량(quantity)
    2. ProductOrderMain 클래스 안에 main() 메서드를 포함하여, 여러 상품의 주문 정보를 배열로 관리하고, 그
        정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자.
     */
    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder();
        ProductOrder order2 = new ProductOrder();
        ProductOrder order3 = new ProductOrder();

        order1.productName="두부";
        order1.price=2000;
        order1.quantity=2;

        order2.productName="김치";
        order2.price=5000;
        order2.quantity=1;

        order3.productName="콜라";
        order3.price=1500;
        order3.quantity=2;

        ProductOrder[] orders = new ProductOrder[]{order1,order2,order3};

        int sum=0;
        for (ProductOrder order : orders) {
            sum += order.price*order.quantity;
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
