package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    //TODO 나머지 코드를 완성해라.
    public void addItem(Item item){
        if(itemCount<items.length){
            items[itemCount]=item;
            itemCount++;
        } else{
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (Item i : items) {
            if(i != null){
                System.out.println("상품명:" + i.getName() + ", 합계:" + i.getTotalPrice());
            } else{
                break;
            }
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int total = 0;
        for (Item i : items) {
            if(i != null){
                total += i.getTotalPrice();
            } else{
                break;
            }
        }
        return total;
    }

    //모법 답안
    /*
    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i<itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice(){
        int total = 0;
        for (int i = 0; i<itemCount; i++) {
            Item item = items[i];
            total += item.getTotalPrice();
        }
        return total;
    }
     */

}
