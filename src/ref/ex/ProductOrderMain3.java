package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    /*
    앞서 만든 상품 주문 시스템을 사용자 입력을 받도록 개선해보자.

    요구사항
    1. 주문 수량을 입력 받자
        예) 입력할 주문의 개수를 입력하세요:
    2. 가격, 수량, 상품명을 입력받자
        입력시 상품 순서를 알 수 있게 "n번째 주문 정보를 입력하세요."라는 메시지를 출력하세요.
    3. 입력이 끝나면 등록한상품과 총 결제 금액을 출력하자.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[n];
        for(int i = 1 ; i <= n; i++){
            scanner.nextLine();
            System.out.println(i + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();

            orders[i-1] = createOrder(productName,price,quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName=productName;
        order.price=price;
        order.quantity=quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price*order.quantity;
        }
        return sum;
    }

}
