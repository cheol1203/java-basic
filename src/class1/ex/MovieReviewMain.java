package class1.ex;

public class MovieReviewMain {
    /*
    요구사항
    1. MovieReview 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
        영화 제목(title)
        리뷰 내용(review)
    2. MovieReviewMain 클래스 안에 main() 메서드를 포함하여, 영화 리뷰 정보를 선언하고 출력하자.
     */
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        MovieReview review2 = new MovieReview();

        review1.title="인셉션";
        review1.review="인생은 무한 루프";
        review2.title="어바웃 타임";
        review2.review="인생 시간 영화!";

        MovieReview[] reviews= new MovieReview[]{review1,review2};

        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }


    }
}
