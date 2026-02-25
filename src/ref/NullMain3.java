package ref;

public class NullMain3 {
    /*
    bigData.data에 참조값을 할당하면 된다.
     */
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data= new Data();

        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
