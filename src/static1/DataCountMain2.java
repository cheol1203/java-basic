package static1;

public class DataCountMain2 {
    /*
    메서드 영역 : 클래스 정보, static 변수, 상수 풀 보관
    static 변수를 사용하면 객체끼리 서로 필드 값을 공유한다. (메서드 영역에서 관리)
     */
    public static void main(String[] args) {
        Data2 data1 = new Data2("A");
        System.out.println("A count=" + Data2.count);

        Data2 data2 = new Data2("B");
        System.out.println("B count=" + Data2.count);

        Data2 data3 = new Data2("C");
        System.out.println("C count=" + Data2.count);

        //인스턴스를 통한 접근
        Data2 data4 = new Data2("D");
        System.out.println(data4.count);
        //클래스를 통합 접근
        System.out.println(Data2.count);
    }
}

