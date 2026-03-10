package poly.ex3;

public class AbstractMain {
    /*
    추상 클래스는 인스턴스 생성 불가하다
    추상 메서드는 하위 클래스에 반드시 오버라이딩 해야한다.
    추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
     */
    public static void main(String[] args) {
        //추상클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
